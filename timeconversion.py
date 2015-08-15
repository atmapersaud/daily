import sys

def main():
    pieces = sys.stdin.readline().strip().split(':')
    ampm = pieces[-1][-2:]
    pieces[-1] = pieces[-1][:-2]

    if ampm == 'AM':
        if pieces[0] == '12':
            pieces[0] = '00'
    elif pieces[0] != '12':
        pieces[0] = str(int(pieces[0]) + 12)
        
    print(':'.join(pieces))

if __name__ == '__main__':
    main()
