import pytest
from test import main
from io import StringIO
import sys

# Phần kiểm thử cho issue 1: Bao phủ tất cả các lệnh của chương trình
@pytest.mark.parametrize("input_value, expected_output", [
    ("4\n", "4 là số chẵn."),
    ("7\n", "7 là số lẻ."),
])
def test_even_odd(input_value, expected_output, monkeypatch, capsys):
    monkeypatch.setattr('sys.stdin', StringIO(input_value))
    main()
    captured = capsys.readouterr()
    assert captured.out.strip() == expected_output

# Phần kiểm thử cho issue 2: Bao phủ tất cả các đường đi trong chương trình
@pytest.mark.parametrize("input_value, expected_output", [
    ("5\n", "Bảng cửu chương của 5:\n5 x 1 = 5\n5 x 2 = 10\n5 x 3 = 15\n5 x 4 = 20\n5 x 5 = 25\n5 x 6 = 30\n5 x 7 = 35\n5 x 8 = 40\n5 x 9 = 45\n5 x 10 = 50")
])
def test_multiplication_table(input_value, expected_output, monkeypatch, capsys):
    monkeypatch.setattr('sys.stdin', StringIO(input_value))
    main()
    captured = capsys.readouterr()
    assert captured.out.strip() == expected_output
