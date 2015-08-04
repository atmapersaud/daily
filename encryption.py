import sys
import math

def main():
    message = sys.stdin.readline().strip()
    L = len(message)
    fl = int(math.floor(math.sqrt(L)))
    cl = int(math.ceil(math.sqrt(L)))
    
    n_rows = fl if L <= (cl * fl) else cl
    n_cols = cl
    
    strarr = []

    for i in range(n_rows):
        lb = i*n_cols
        ub = (i+1)*(n_cols)
        strarr.append(message[lb:ub])
    
    encrypted = ''
    for j in range(n_cols):
        encrypted += (''.join(row[j] for row in strarr if len(row) > j))
        encrypted += ' '
        
    print(encrypted)

if __name__ == '__main__':
    main()
