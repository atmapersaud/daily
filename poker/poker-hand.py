import sys

def main():
    suit_dict = {'c': u'\u2663', 's':u'\u2660', 'h':u'\u2665', 'd':u'\u2666' }
    ranks = [str(num) for num in range(2,10)]
    ranks.extend(['T','J','Q','K','A'])
    rvals = {rank:i for i, rank in enumerate(ranks)}

    cards = sys.stdin.readline().strip().split()
    hand = sorted(cards, key=lambda card:rank_val(card, rvals)) 

    hand_is_flush = isFlush(hand)
    hand_is_straight = isStraight(hand, rvals)

    if hand_is_flush and hand_is_straight:
        print('Straight Flush')
        return

    hand_dist = histogram(hand)

    if hand_dist == (4,1):
        print('Four of a Kind')
        return

    if hand_dist == (3,2):
        print('Full House')
        return
        
    if hand_is_flush:
        print('Flush')
        return

    if hand_is_straight:
        print('Straight')
        return

    if hand_dist == (3,1,1):
        print('Three of a Kind')
        return

    if hand_dist == (2,2,1):
        print('Two Pair')
        return
        # one kicker

    if hand_dist == (2,1,1,1):
        print('Pair')
        return
        # three kickers

    if hand_dist == (1,1,1,1,1):
        print('High Card')
        return
        # four kickers

def histogram(hand):
    rank_count = {}
    for card in hand:
        if rank(card) not in rank_count:
            rank_count[rank(card)] = 1
        else:
            rank_count[rank(card)] += 1
    return tuple(sorted(rank_count.values(), reverse=True))

def rank(card):
    return card[0]

def rank_val(card, rvals):
    return rvals[card[0]]

def suit(card):
    return card[1]

def isFlush(hand):
    suits = {suit(card) for card in hand}
    return len(suits) == 1

def isStraight(hand, rvals):
    prev = hand[0]
    for card in hand[1:]:
        if rank_val(card, rvals) == rank_val(prev, rvals) + 1:
            prev = card
        else:
            return False
    return True

if __name__ == '__main__':
    main()
