import sys

def main():
    T = int(sys.stdin.readline())

    for i in range(T):
        R, C = map(int, sys.stdin.readline().split())
        G = [sys.stdin.readline().strip() for j in range(R)]

        r, c = map(int, sys.stdin.readline().split())
        P = [sys.stdin.readline().strip() for k in range(r)]

        consecutive_matches = 0
        for line in G:
            if line.find(P[consecutive_matches]) >= 0:
                consecutive_matches += 1
                #print('match')
                if consecutive_matches == r:
                    print('YES')
                    break
            else:
                #print('nomatch')
                consecutive_matches = 0
        else:
            print('NO')
        
if __name__ == '__main__':
    main()
