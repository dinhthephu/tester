def main():
    # Nhập một số nguyên từ người dùng
    number = int(input("Nhập một số nguyên: "))

    # Kiểm tra số đó là số chẵn hay số lẻ
    if number % 2 == 0:
        print(f"{number} là số chẵn.")
    else:
        print(f"{number} là số lẻ.")

    # In ra bảng cửu chương của số vừa nhập
    print(f"Bảng cửu chương của {number}:")
    for i in range(1, 11):
        print(f"{number} x {i} = {number * i}")

if __name__ == "__main__":
    main()
