def remove_even(arr):
    result = []
    
    for ele in arr:
        if ele % 2 != 0:
            result.append(ele)
    
    return result

def main():
    arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    new_arr = remove_even(arr)
    print(new_arr)

if __name__ == "__main__":
    main()
