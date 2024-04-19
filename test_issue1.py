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

