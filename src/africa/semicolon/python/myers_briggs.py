questionnaire = [
    ["expend energy, enjoy groups", "conserve energy, enjoy one-on-one"],
    ["interpret literally", "look for meaning and possibilities"],
    ["logical, thinking, questioning", "empathetic, feeling, accommodating"],
    ["organized, orderly", "flexible, adaptable"],
    ["more outgoing, think out loud", "more reserved, think to yourself"],
    ["practical, realistic, experiential", "imaginative, innovative, theoretical"],
    ["candid, straight forward, frank", "tactful, kind, encouraging"],
    ["plan, schedule", "unplanned, spontaneous"],
    ["seek many tasks, public activities, interaction with others", "seek private, solitary activities "
                                                                    "with quiet to concentrate"],
    ["standard, usual, conventional", "different, novel, unique"],
    ["firm, tend to criticize, hold the line", "gentle, tend to appreciate, conciliate"],
    ["regulated, structured”", "easygoing, “live” and “let live”"],
    ["external, communicative, express yourself", "internal, reticent, keep to yourself"],
    ["focus on here-and-now", "look to the future, global perspective, \"big picture\""],
    ["tough-minded, just", "tender-hearted, merciful"],
    ["active, initiate", "reflective, deliberate"],
    ["preparation, plan ahead", "go with the flow, adapt as you go"],
    ["facts, things, \"what is\"", "ideas, dreams, \"what could be,\" philosophical"],
    ["matter of fact, issue-oriented", "sensitive, people-oriented, compassionate"],
    ["control, govern", "latitude, freedom"]
]


def get_option_a_or_b(response_option):
    if response_option.upper() == "A" or response_option.upper() == "B":
        return response_option
    else:
        raise ValueError("Wrong choice; choose A or B")


def get_option():
    while True:
        try:
            response_option = get_option_a_or_b(input())
            return response_option
        except ValueError as err:
            print("\033[91m" + str(err))


def place_checkmark(num, position):
    return chr(10003) if (num == 1 and position == 1) or (num == 0 and position == 2) else ""


responses = [0] * 20
option = ""
i = 0
for question in questionnaire:

    print(f"Question {i + 1}")
    print(f"A. {question[0]}")
    print(f"B. {question[1]}")
    print("Pick an option: A or B")
    option = get_option()
    if option.upper() == "A":
        responses[i] = 1
    i += 1

personality = [["E", "I"], ["S", "N"], ["T", "F"], ["J", "P"]]
options_count = [[0] * 2 for _ in range(4)]
personality_type = ""
for i in range(len(responses) // 5):
    total = 0
    for j in range(i, len(responses), 4):
        total += responses[j]

    options_count[i][0] = total
    options_count[i][1] = 5 - total
    if total >= 3:
        personality_type += personality[i][0]
    else:
        personality_type += personality[i][1]

print(responses)
print("\nYour choice at a glance\n")
print("|%5s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s |" % (" ", "A", "B",
                                                                                    " ", "A", "B", " ", "A", "B", " ",
                                                                                    "A", "B"))
print("%s" % ("-" * 74))

for i in range(0, len(responses), 4):
    print("|%5d | %3s | %3s | %3d | %3s | %3s | %3d | %3s | %3s | %3d | %3s | %3s |" % (
        i + 1, place_checkmark(responses[i], 1), place_checkmark(responses[i], 2),
        i + 2, place_checkmark(responses[i + 1], 1), place_checkmark(responses[i + 1], 2), i + 3,
        place_checkmark(responses[i + 2], 1), place_checkmark(responses[i + 2], 2), i + 4,
        place_checkmark(responses[i + 3], 1), place_checkmark(responses[i + 3], 2)))

print("%s" % ("-" * 74))
print("|%5s | %3d | %3d | %3s | %3d | %3d | %3s | %3d | %3d | %3s | %3d | %3d |" % (
    "TOTAL", options_count[0][0], options_count[0][1],
    " ", options_count[1][0], options_count[1][1], " ", options_count[2][0], options_count[2][1], " ",
    options_count[3][0],
    options_count[3][1]))
print("%s" % ("-" * 74))
print("|%5s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s |" % (" ", "E", "I",
                                                                                    " ", "S", "N", " ", "T", "F", " ",
                                                                                    "J", "P"))

print("\nYour personality type is " + personality_type)
print("For your personality interpretation, visit : ")
print("https://www.truity.com/personality-type/" + personality_type)
print("For all personality types visit: ")
print("https://www.truity.com/page/16-personality-types-myers-briggs")
