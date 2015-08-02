import sys

def main():
    n = int(sys.stdin.readline())

    for i in range(1, n+1):
        print(" " * (n - i) + "#" * i)

if __name__ == '__main__':
    main()
