import sys

def main():
    n = int(sys.stdin.readline())
    
    print(str(fact(n)))
 
def fact(n):
    prod = n
    while n > 1:
        n = n - 1
        prod = prod * n
    return prod

if __name__ == '__main__':
    main()
