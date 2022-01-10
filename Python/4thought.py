exp = ['+', '-', '*', '//']

def main():
    for _ in range(int(input())):
        curr = solution()
        print(curr.replace("//", "/") if curr != "" else "no solution")

def solution():
    goal = int(input())
    for a in exp:
        for b in exp:
            for c in exp:
                curr = f"4 {a} 4 {b} 4 {c} 4"
                if eval(curr) == goal:
                    return f"{curr} = {goal}"
    return ""

if __name__ == "__main__":
    main()