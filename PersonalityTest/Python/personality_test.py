print("\n\t\tMBTI PERSONALITY TEST")
print("====================================\n")

user_name = input("What is your name?  ")

print("\nHey " , user_name , "!\nIt takes only 10 minutes to get a \"freakishly accurate\" description \nof who you are and why you do things the way you do!")
print("\nINSTRUCTIONS")
print("---------------------------------------------------------------------------")
print("\nKindly answer A or B for all questions.\nYour result will be determined by your responses.\n\n")

begin = int(input("Press 1 to begin: "))

question = 1
options = ""

option_a = ""
option_b = ""

while begin != 1: 
    print("\nI know this is an Error\n")
    begin = int(input("Please press 1: "))

selected_options_for_section_one = [""] * 5
user_choice = ""
count = 0

number_of_a_for_section_one = 0
number_Of_b_for_section_one = 0

print("\n\nSECTION ONE")
print("==================================\n")

while question <= 5:

    match (question):

        case 1: 
            option_a = "expend energy, enjoy groups"
            option_b = "conserve energy, enjoy one-on-one"
            options = f"\nEXTROVERTED E VS ROVERTED I\n\nA. {option_a} \t B. {option_b}"
        
        case 2: 
            option_a = "more outgoing, think out loud"
            option_b = "more reserved, think to yourself"
            options = f"\nA. {option_a} \t B. {option_b}"         

        case 3: 
            option_a = "seek many tasks, public activities, eraction with others"
            option_b = "seek private, solitary activities with quiet to concentrate"
            options = f"\nA. {option_a} \t B. {option_b}"      

        case 4: 
            option_a = "external, communicative, express yourself"
            option_b = "ernal, reticent, keep to yourself"
            options = f"\nA. {option_a} \t B. {option_b}"
        
        case 5: 
            option_a = "active, initiate"
            option_b = "reflective, deliberate"
            options = f"\nA. {option_a} \t B. {option_b}"
            
    print(options)
    user_choice =input()

    if user_choice.upper() == "A": 
        selected_options_for_section_one[count] = option_a
        number_of_a_for_section_one += 1
        question += 1
        count += 1

    elif user_choice.upper() == "B": 
        selected_options_for_section_one[count] = option_b 
        number_Of_b_for_section_one += 1
        question += 1
        count += 1

    else: 
        print("\nI know this is an error.\nPlease enter A or B")
   
user_personality_type = ""

if number_of_a_for_section_one > number_Of_b_for_section_one: 
    user_personality_type += 'E'
else: 
    user_personality_type += 'I'

selected_options_for_section_two = [""] * 5
user_choice = ""
count = 0

number_Of_a_for_section_two = 0
number_of_b_for_section_two = 0

print("\nSECTION TWO")
print("================================\n")

while question <= 10:

    match(question): 

        case 6: 
            option_a = "interpret literally"
            option_b = "look for meaning and possibilities"
            options = f"\nSENSING S VS INTUITIVE N\n\nA. {option_a} \t B. {option_b}" 
        
        case 7: 
            option_a = "practical, realistic, experiential"
            option_b = "imaginative, innovative, theoretical"
            options = f"\nA. {option_a} \t B. {option_b}"       

        case 8: 
            option_a = "standard, usual, conventional"
            option_b = "different, novel, unique"
            options = f"\nA. {option_a} \t B. {option_b}"
        
        case 9: 
            option_a = "focus on here-and-now"
            option_b = "look to the future, global perspective, big picture"
            options = f"\nA. {option_a} \t B. {option_b}"
        
        case 10: 
            option_a = "facts, things, what is"
            option_b = "ideas, dreams, what could be, philosophical"
            options = f"\nA. {option_a} \t B. {option_b}"
        
    print(options)  
    user_choice = input()

    if user_choice.upper() == "A": 
        selected_options_for_section_two[count] = option_a
        number_Of_a_for_section_two += 1
        question += 1
        count += 1

    elif user_choice.upper() == "B": 
        selected_options_for_section_two[count] = option_b 
        number_of_b_for_section_two += 1
        question += 1
        count += 1

    else:
        print("\nI know this is an error.\nPlease enter A or B")

if number_Of_a_for_section_two > number_of_b_for_section_two:
    user_personality_type += 'S'
else:
    user_personality_type += 'N'

selected_options_for_section_three = [""] * 5
user_choice = ""
count = 0

number_of_a_for_section_three = 0
number_of_b_for_section_three = 0

print("\nSECTION THREE")
print("==============================\n")

while question <= 15: 

    match (question): 

        case 11: 
            option_a = "logical, thinking, questioning"
            option_b = "empathetic, feeling, accommodating"
            options = f"\nTHINKING T VS FEELING F\n\nA. {option_a} \t B. {option_b}"
        
        case 12: 
            option_a = "candid, straight forward, frank"
            option_b = "tactful, kind, encouraging"
            options = f"\nA. {option_a} \t B. {option_b}"
        
        case 13: 
            option_a = "firm, tend to criticize, hold the line"
            option_b = "gentle, tend to appreciate, conciliate"
            options = f"\nA. {option_a} \t B. {option_b}"
        
        case 14: 
            option_a = "tough-minded, just"
            option_b = "tender-hearted, merciful"
            options = f"\nA. {option_a} \t B. {option_b}"
        
        case 15: 
            option_a = "matter of fact, issue-oriented"
            option_b = "sensitive, people-oriented, compassionate"
            options = f"\nA. {option_a} \t B. {option_b}"
        
    print(options)  
    user_choice = input()

    if user_choice.upper() == "A": 
        selected_options_for_section_three[count] = option_a
        number_of_a_for_section_three += 1
        question += 1
        count += 1


    elif user_choice.upper() == "B": 
        selected_options_for_section_three[count] = option_b 
        number_of_b_for_section_three += 1
        question += 1
        count += 1

    else: 
        print("\nI know this is an error.\nPlease enter A or B")

if number_of_a_for_section_three > number_of_b_for_section_three: 
    user_personality_type += 'T'
else:
    user_personality_type += 'F'

count = 0
selected_options_for_section_four = [""] * 5
user_choice = ""

number_of_a_for_section_four = 0
number_of_b_for_section_four = 0

print("\nSECTION FOUR")
print("==============================\n")

while question <= 20: 

    match (question): 

        case 16: 
            option_a = "organized, orderly"
            option_b = "flexible, adaptable"
            options = "\nJUDGING J VS PERCEPTIVE P\n\nA. {option_a} \t B. {option_b}"

        case 17: 
            option_a = "plan, schedule"
            option_b = "unplanned, spontaneous"
            options = f"\nA. {option_a} \t B. {option_b}"
        
        case 18: 
            option_a = "regulated, structured"
            option_b = "easy-going, live and  live"
            options = f"\nA. {option_a} \t B. {option_b}"
        
        case 19: 
            option_a = "preparation, plan ahead"
            option_b = "go with the flow, adapt as you go"
            options = f"\nA. {option_a} \t B. {option_b}"
        
        case 20: 
            option_a = "control, govern"
            option_b = "latitude, freedom"
            options = f"\nA. {option_a} \t B. {option_b}"       

    print(options)  
    user_choice = input()

    if user_choice.upper() == "A":
        selected_options_for_section_four[count] = option_a
        number_of_a_for_section_four += 1
        question += 1
        count += 1

    elif user_choice.upper() == "B": 
        selected_options_for_section_four[count] = option_b 
        number_of_b_for_section_four += 1
        question += 1
        count += 1

    else: 
        print("\nI know this is an error.\nPlease enter A or B")

if number_of_a_for_section_four > number_of_b_for_section_four:
    user_personality_type += 'J'
else:
    user_personality_type += 'P'

print("\nHello " , userName , ". You selected:")
print("\nSECTION ONE")

for selected_options in range (len(selected_options_for_section_one)): 
    print(selected_options)

print("\nNumber of A seleceted: " , number_of_a_for_section_one)
print("Number of B seleceted: " , number_of_b_for_section_one)

print("\nSECTION TWO")

for selected_options in range (len(selected_options_for_section_two)): 
    print(selected_options)

print("\nNumber of A seleceted: " , number_of_a_for_section_two)
print("Number of B seleceted: " , number_of_b_for_section_two)

print("\nSECTION THREE")

for selected_options in range (len(selected_options_for_section_three)): 
    print(selected_options)

print("\nNumber of A seleceted: " , number_of_a_for_section_three)
print("Number of B seleceted: " , number_of_b_for_section_three)

print("\nSECTION FOUR")

for selected_options in range (len(selected_options_for_section_four)): 
    print(selected_options)

print("\nNumber of A seleceted: " , number_of_a_for_section_four)
print("Number of B seleceted: " , number_of_b_for_section_four)

user_personality_type
print("\nYour personality type is: " , user_personality_type)

print("press 1 to know more about ", user_personality_type)
knowMore = int(input())

while knowMore != 1:
    print("\nI know this is an Error\nPlease press 1")
    knowMore = int(input())

if user_personality_type == "INTJ":
    print("""
        The Architect (INTJ) personality type is defined by a strategic, independent, and deeply logical approach to life.
        Driven by an insatiable thirst for knowledge and continuous self-improvement,
        these individuals apply a rare blend of ense creativity and straightforward rationality to everything they do.
        They take immense pride in their sharp minds, consistently working to master any topic that piques their interest 
        while naturally seeing right through social conventions and hypocrisy.

        Operating with a powerful "lone-wolf" mentality, Architects prefer to make their own discoveries 
        rather than relying on authority or traditional rules. They possess a fierce willpower and apply single-minded drive to their goals, 
        showing little patience for arbitrary restrictions. While this independence can make them appear cold, blunt, or detached, 
        they actually feel things deeply and spend significant energy analyzing their own mistakes. 
        They simply choose to prioritize truth and competence over polite small talk.

        Ultimately, the INTJ views life as a giant game of chess. They reject chance, 
        preferring to carefully calculate the strengths and weaknesses of every move before they make it. 
        They remain full of fascinating contradictions—imaginative yet decisive, ambitious yet private
        —but they never lose faith that their ingenuity will allow them to master any challenge.

        """)

if user_personality_type ==  "INTP":
    print("""
        The Logician (INTP) personality type is defined by a flexible, analytical, and highly unconventional approach to life. 
        Driven by an insatiable curiosity about the universe, these individuals possess a vigorous intellect 
        and a natural knack for spotting patterns and discrepancies. 
        They are imaginative, creative, and independent thinkers who are compely unafraid 
        to step outside traditional boundaries to explore unique, untested paths.

        Living largely within the vibrant world of their own minds, Logicians are prone to getting lost in deep thought, 
        antly debating ideas and theories from the moment they wake up. 
        As introverts, they cherish their solitude to recharge and find themselves most productive when distractions are minimal. 
        However, when they connect with someone who matches their intense mental energy, they enthusiastically light up, 
        jumping from one thought to another in lively, conceptual brainstorming sessions.
  
        Despite their intellectual genius, Logicians face specific internal challenges. While they excel at dissecting complex, 
        multilayered problems, the practical, everyday work of executing their ideas does not always hold their interest. 
        Furthermore, they are frequently mystified by human nature and the irrational ways emotions influence behavior. 
        This can lead to intense "analysis paralysis," where overthinking even minor decisions leaves them feeling stuck or ineffective.

        Ultimately, the INTP thrives on logic and open-mindedness. By leveraging their natural creativity, 
        they are able to pull themselves out of cognitive ruts, beautifully balancing their passion for abstract theory 
        with their journey toward becoming happy, well-rounded individuals.

        """)

if user_personality_type == "ENTJ":
    print("""
        The Commander (ENTJ) personality type is defined by a decisive, highly ambitious, and strategic approach to life. 
        Characterized by a potent blend of charisma, confidence, and natural authority, 
        these individuals are natural-born leaders who project an innate ability to rally crowds together behind a shared vision. 
        They gather information to build creative long-term goals but rarely hesitate for long before taking action, 
        driven by an intense desire for momentum and spectacular accomplishment.

        Thriving on challenges, Commanders use sharp rationality and absolute willpower to push through obstacles where others might give up.
        This relentless drive makes them brilliant entrepreneurs and powerful, unyielding negotiators who genuinely enjoy the psychological battle of wits. 
        They deeply respect competence and possess a unique skill for recognizing talent in others, 
        which helps them build highly effective teams to execute their visions.

        However, this ensity can create significant erpersonal friction. In their single-minded pursuit of efficiency, 
        Commanders may dismiss emotional displays as signs of weakness, occasionally calling out failures with a chilling degree of insensitivity. 
        They run the risk of alienating the very teams they rely on by overlooking the emotional needs of their support network.

        Ultimately, the ENTJ is a true powerhouse who cultivates a larger-than-life image.
        By consciously combining their self-discipline and strategic strengths with an emotionally healthy focus, 
        they can transform from merely dominant managers o inspiring leaders, securing both their desired victories and deep, satisfying relationships.

        """)

if user_personality_type ==  "ENTP":
    print("""
        The Debater (ENTP) personality type is defined by a bold, quick-witted, and highly creative approach to life. 
        Characterized by immense mental agility, these individuals thrive on deructing and rebuilding concepts, 
        antly pushing past traditional boundaries. They are natural nonconformists who aren't afraid to question the status quo, 
        frequently finding joy in verbal sparring and adopting a playful, contrarian sense of humor to test ideas.

        Driven by an insatiable desire for innovation, Debaters act as ultimate devil's advocates, 
        happily shredding arguments to see the world from different perspectives. They view blind conformity as a limitation, 
        preferring to rethink standard assumptions and champion underdogs. However, their active minds antly generate new theories, 
        making it difficult to focus on implementation. They love the thrill of brainstorming big ideas 
        but often struggle with the everyday grunt work required to turn visions o reality.

        This relentless contrarianism can create significant friction in their personal and professional lives. 
        In their pursuit of logic and rationality, they may inadvertently brush aside others' feelings, 
        alienating colleagues or partners by turning casual conversations into intense debates. 
        To achieve true success, they must learn that winning an argument is not always worth burning a bridge.

        Ultimately, the ENTP is a visionary powerhouse with confidence and a keen sense of humor. 
        By using their natural cognitive flexibility to cultivate sensitivity, they can learn when to compromise without losing their sharp, 
        nonconformist edge, paving the way for deep, lasting relationships and meaningful real-world achievements.

        """)

if user_personality_type == "INFJ":
    print("""
        The Advocate (INFJ) personality type is defined by a deeply thoughtful, idealistic, and compassionate approach to life.
        Guided by a quiet, principled humanism, these rare individuals seek fulfillment not through wealth or status, 
        but by standing up for what is right and acting as a force for good. They possess a rich inner vision and moving imagination, 
        allowing them to balance the head and the heart to uplift others and correct societal injustices.

        Far from being idle dreamers, Advocates are highly conscientious and driven by an intense commitment to egrity. 
        They move through the world with a profound ernal passion and an enormous capacity for empathy. 
        Because they value deep, authentic connections, they prefer meaningful conversations over superficial small talk. 
        They pour great care o their relationships, communicating with an emotional honesty that leaves a powerful impression on those around them.

        However, this dedication comes with distinct ernal challenges. Advocates often feel misunderstood or different from those around them, 
        which can lead to isolation. Because they focus so intensely on their mission to fix the world's problems, they frequently neglect their own well-being. 
        This selfless pattern makes them highly vulnerable to stress and burnout. 
        Furthermore, they are incredibly sensitive to criticism and can take pushback deeply to heart when their good intentions go unappreciated.

        Ultimately, the INFJ feels called to a unique life purpose. 
        By learning to pause and extend the same compassion to themselves that they give to others, 
        they can sustain their visionary strength and successfully achieve lasting, positive change.

        """)

if user_personality_type == "INFP":
    print("""
        The Mediator (INFP) personality type is defined by a quiet, open-minded, and intensely imaginative approach to life. 
        Guided by a deep sensitivity and a caring nature, these individuals possess a vibrant, passionate inner world. 
        They are highly sentimental and nostalgic, frequently experiencing profound emotional responses to art, nature, and human connection. 
        Brimming with idealism, they long for soulful relationships and feel a sincere calling to help others.

        Empathy is the Mediator's greatest gift, allowing them to be compassionate, nonjudgmental listeners who genuinely yearn to understand the depths of human nature.
        However, this deep empathy can also become a liability. Because they imately feel the troubles of the world,
        they are highly vulnerable to ernalizing the negative moods of others. Without firm boundaries, they can easily become overwhelmed by a desire to fix every wrong.

        Authenticity is paramount to an INFP, making them uneasy with anything that feels fake. They crave creative self-expression, 
        often utilizing metaphors, writing, or art to share their innermost thoughts. While their rich daydreams are a beautiful source of innovation, 
        they can lead to inaction. They frequently struggle with overthinking, intensely deliberating choices until the last possible moment, 
        which can leave them feeling directionless or stuck.

        Ultimately, the INFP thrives once they connect with a clear, focused sense of purpose. 
        By learning to direct their creative energy rather than scattering it, they can pull themselves out of reflective ruts. 
        Their quiet belief in doing the right thing naturally inspires compassion, kindness, and beauty wherever they go.

        """)

if user_personality_type == "ENFJ":
    print("""
        The Protagonist (ENFJ) personality type is defined by a warm, charismatic, and deeply idealistic approach to life. 
        Driven by an innate sense of duty, these natural-born leaders feel a strong calling to serve a greater purpose and make a positive impact on the world. 
        They possess a rare blend of passionate creative energy and firm values, allowing them to confidently guide, coach, 
        and inspire those around them to achieve their full potential.

        Communication is the Protagonist’s secret weapon. Armed with an uncanny ability to read underlying motivations and empathize with others instantly, 
        they speak with an eloquence and sensitivity that is nearly impossible to ignore. 
        Their desire to advocate for altruism and stand up against injustice is fueled by a genuine purity of intent rather than a thirst for power. 
        They actively seek common ground, leading by example in their daily lives to show how compassion can transform ordinary situations.

        However, their intense dedication to helping others can create significant personal boundaries issues. 
        Because they possess a clear vision of how loved ones should better themselves, they can easily overstep, pushing too hard and causing others to feel judged or resentful. 
        When inserting themselves into complex dilemmas, even the most insightful ENFJ risks misreading a situation or offering misguided advice.

        Ultimately, the ENFJ is a devoted altruist who remains remarkably hopeful in the face of adversity. 
        By balancing their urge to fix everyone's problems with a respect for personal boundaries, 
        they successfully channel their leadership into lasting global and personal progress.

        """)

if user_personality_type == "ENFP":
    print("""
        The Campaigner (ENFP) personality type is defined by an energetic, openhearted, and deeply imaginative approach to life.
        Characterized by a rare combination of carefree sociability and profound inner depth, these vibrant free spirits stand out in any crowd. 
        They are driven by an intense desire for meaningful emotional connections and carry an unwavering belief that everything and everyone is fundamentally erconnected, 
        always searching for magic and deeper significance in everyday moments.

        When a fresh idea sparks their creativity, Campaigners radiate an infectious enthusiasm that naturally draws others to them, 
        frequently elevating them o informal leadership roles. They are deeply curious about human relationships, 
        using their natural warmth and empathy to create safe spaces where others feel comfortable opening up. 
        They effortlessly balance a capacity for intense, rospective thought with a love for kicking back and seeking life's joyful pleasures.

        However, this restless imagination roduces specific behavioral hurdles. Once the initial bloom of inspiration fades, 
        Campaigners often struggle with self-discipline and long-term consistency, causing them to lose steam on projects before reaching the finish line. 
        Additionally, their strong uition can lead them to overanalyze other people's actions. Instead of seeking direct clarity, 
        they may ernalize social stress by puzzling over hidden motives or intentions.

        Ultimately, the ENFP is an independent idealist guided by hope and goodwill. By learning to anchor their vast energy with consistency and clearer boundaries, 
        they can successfully navigate their path, using their courage and empathy to light up the world around them.

        """)

if user_personality_type == "ISTJ":
    print("""
        The Logistician (ISTJ) personality type is defined by a reserved, highly methodical, and rational approach to life. 
        Characterized by a potent blend of egrity, responsibility, and unwavering dependability, these individuals serve as the steady backbone of their families and communities. 
        They mean what they say and say what they mean, routinely favoring careful deliberation and logic over impulsive behaviors 
        to ensure every action is carried out with clear, purposeful direction.

        Thriving in environments with clear hierarchies and established expectations, Logisticians hold a deep respect for structure, tradition, and honesty. 
        They move through the world with a strict adherence to doing things the right way, readily accepting personal responsibility 
        and admitting mistakes even when it is uncomfortable. However, this rigorous self-control can lead to a rigid mindset, 
        causing them to unfairly misjudge others who do not match their intense work ethic as lazy or incompetent.

        This deep sense of obligation can also become a significant personal liability. Because they possess an unyielding drive to meet commitments, 
        Logisticians frequently find themselves shouldering extra burdens and picking up the slack for less reliable peers. 
        While they rarely express their growing frustration or resentment openly, this chronic overextension can leave them feeling exhausted, discouraged, and unappreciated.

        Ultimately, the ISTJ is a dedicated powerhouse of clarity and loyalty. By learning to speak up when overstretched and setting sustainable boundaries, 
        they can protect their own energy, allowing their exceptional practicality and grounded nature to effectively support the world around them.

        """)

if user_personality_type == "ISFJ":
    print("""
        The Defender (ISFJ) personality type is defined by a warm, unassuming, and deeply responsible approach to life. 
        Characterized by a potent blend of emotional sensitivity and excellent analytical abilities, these hardworking individuals thrive on 
        giving careful attention to the practical details of daily life. They serve as true altruists, meeting deadlines, upholding traditions, 
        and quietly operating behind the scenes to keep the world running smoothly without ever demanding the spotlight.

        Loyalty is the Defender's greatest strength. They invest incredible energy o maaining strong relationships, routinely dropping everything 
        to lend a hand to a friend or family member in need. This deep desire to serve extends wholeheartedly to their employers and communities. 
        However, their intense commitment can become a major liability, as less considerate individuals often take advantage of their helpful nature, 
        leaving them overworked and heavily burned out.

        Furthermore, Defenders possess an intense streak of perfectionism where "good enough" is rarely acceptable. 
        They consistently go above and beyond to exceed expectations, yet their natural humility causes them to underplay their achievements. 
        While they do not seek fame, they deeply crave genuine appreciation. When left unacknowledged, they struggle to stand up for themselves, 
        which can cause them to quietly lose motivation and build ernal resentment.

        Ultimately, the ISFJ possesses a unique social talent for making others feel deeply seen, known, and cherished. 
        By learning to overcome their fear of sudden change and extending the same care to themselves that they offer to others, 
        they can protect their energy and continue building happy, secure lives for everyone around them.

        """)

if user_personality_type == "ESTJ":
    print("""
        The Executive (ESTJ) personality type is defined by a highly organized, dedicated, and structured approach to life. 
        Driven by principles of tradition and order, these natural leaders utilize their deep understanding of what is socially acceptable to bring families, 
        communities, and workplaces together. They possess immense fortitude, consistently offering stable direction and sensible judgment amid adversity 
        while confidently forging ahead on difficult paths without giving up under stress.

        As model citizens, Executives lead by example, championing honesty, diligence, and an absolute rejection of cheating or laziness. Operating in a world of clear, 
        verifiable facts, they dive headfirst into complex tasks, effortlessly sorting details and streamlining action plans to make massive projects 
        feel manageable and approachable. They take massive pride in their reliability, considering it a personal duty to finish exactly what they start.

        However, this relentless work ethic roduces distinct erpersonal hurdles. Executives expect their standards of excellence and 
        commitment to be fiercely reciprocated. When partners or colleagues jeopardize a plan through perceived incompetence or laziness, 
        they will not hesitate to voice their disappoment, earning them a reputation for inflexibility and stubbornness. 
        Their strict focus on rules can blind them to unconventional approaches or creative solutions.

        Ultimately, the ESTJ is a trustworthy powerhouse of efficiency and order. By learning to slow down and recognize that not everyone follows the same path, 
        they can better egrate diverse viewpoints into their plans. This inclusive shift allows them to lead charges that work for everyone, securing lasting communal success.

        """)

if user_personality_type == "ESFJ":
    print("""
        The Consul (ESFJ) personality type is defined by an attentive, outgoing, and deeply people-focused approach to life. 
        Driven by strong communal values and a sense of duty, these social individuals serve as the bedrock of their neighborhoods and families. 
        They find immense joy in hospitality, keeping everyone connected, and ensuring that those around them feel supported, celebrated, and compely secure.

        As dedicated altruists, Consuls possess a clear moral compass based on tradition, protocols, and social norms. They memorize the smallest details of 
        their loved ones' lives—never missing a birthday or milestone—and put enormous energy o hosting structured events where everyone feels special. 
        They are happiest when they know they are needed and relied upon.

        However, this fierce commitment to order and relationships presents personal challenges. Because they believe there is a single "right way"
        to handle most situations, Consuls can become highly opinionated and judgmental toward those who choose alternative paths. 
        They often take it deeply to heart if their extensive efforts go unappreciated, and they struggle immensely with the realization that 
        they cannot control the choices or behaviors of others.

        Ultimately, the ESFJ is a generous powerhouse of reliability and compassion. By learning to accept open-ended situations 
        and respecting others' unique viewpoints, they can find true peace. They thrive best by leading through an example of genuine care, 
        naturally bridging differences to bring diverse groups of people together.
 
        """)

if user_personality_type == "ISTP":
    print("""
        The Virtuoso (ISTP) personality type is defined by an individualistic, highly pragmatic, and hands-on approach to life. 
        Characterized by a blend of casual curiosity and skepticism, these natural makers love exploring the physical world, dismantling mechanisms, 
        and improving them through trial and error. They excel at direct problem-solving, preferring firsthand experience and working at their own pace 
        over convoluted troubleshooting methods or predefined routines.

        Operating with a powerful need for autonomy, Virtuosos march to the beat of their own drum, compely unbound by societal norms or conventions. 
        While they appear calm and steady, they store an impulsive energy that can explode without warning, driving them to spontaneously pivot toward bold new erests. 
        This direct nature makes them highly unpredictable to others, as they feel no qualms about walking away from situations that have lost their practical utility or excitement.

        However, this fierce independence roduces social challenges. Virtuosos generally find extensive socializing taxing, choosing small, 
        meaningful eractions over superficial networking. Because they value efficiency and facts over social niceties, their straightforward communication style
        is frequently miserpreted as bluntness or insensitivity. They compely reject people-pleasing, which can accidentally alienate or 
        frustrate colleagues and loved ones who require more emotional reassurance.

        Ultimately, the ISTP is a genuine powerhouse of personal skill and adaptability. By finding an environment that respects their deep need for freedom, 
        space, and unpredictability, they can beautifully balance their instinctual, rule-defying nature with satisfying real-world achievements.

        """)

if user_personality_type == "ISFP":
    print("""
        The Adventurer (ISFP) personality type is defined by an open-minded, deeply expressive, and grounded approach to life. 
        Viewing existence itself as a canvas for self-expression, these free-spirited individuals live fluidly in the present moment. 
        They possess a remarkable ability to find beauty and joy in everyday experiences, navigating the world with a flexible, adaptable mindset 
        that prioritizes personal autonomy and an infectiously encouraging attitude toward others.

        Operating without strict schedules, Adventurers take each day as it comes, leaving ample room for spontaneous outings and unexpected discoveries. 
        This flexible nature makes them exceptionally tolerant, compassionate, and nonjudgmental. They genuinely appreciate the diverse nature of humanity 
        and rarely attempt to change others. However, this go-with-the-flow mentality can make it difficult to establish or stick to long-term plans, 
        often leaving them with a cloudy view of their goals and a fear of ting people down.

        In social circles, Adventurers are warm, friendly, and deeply caring companions who effortlessly pick up on unspoken emotions. 
        They require dedicated alone time to recharge and anchor their identity, but they remain sensitive to criticism, deeply desiring approval 
        and appreciation from those they cherish. Because they live firmly in the present, they rarely dwell on past hurts,
        preferring to remain highly forgiving and open to giving second chances.

        Ultimately, the ISFP is a humble artist of life who marches to the beat of their own drum. 
        By roducing just a touch of structure to guide their independent spirit, they can comfortably transform their creative potentials into lasting, impactful realities.
   
        """)

if user_personality_type == "ESTP":
    print("""
        The Entrepreneur (ESTP) personality type is defined by a vibrant, action-oriented, and highly spontaneous approach to life. 
        Brimming with enthusiastic energy, these individuals thrive on navigating immediate realities and uncovering opportunities.
        They are fiercely competitive and live firmly in the present moment, possessing a bold, brave spirit that is compely unafraid to take risks, 
        act on impulse, or dive directly o the center of the action.

        Abstract theories and prolonged discussions rarely hold an Entrepreneur’s erest. They prefer energetic conversations focused on real-world facts, 
        often leaping o projects before they look and fixing mistakes as they go rather than sitting idle. This hands-on, rapid-fire rational stimulus response
        makes regimented environments like formal schooling a massive challenge. Operating by their own moral compass, they view rules as 
        flexible guidelines made to be broken to maximize exciting outcomes.

        Socially, Entrepreneurs possess arguably the most perceptive, unfiltered view of any type. They have an uncanny knack for spotting tiny changes 
        in their environment—such as a shift in someone's facial expression or habits—and will immediately call out these observations with straightforward directness. 
        This rapid insight makes them exceptional group leaders and invaluable assets during fast-paced situations or emergencies, 
        bringing life and colorful excitement wherever they go.

        Ultimately, the ESTP is a natural powerhouse of momentum and charm. By focusing their abundant energy through tedious but necessary tasks 
        and minimizing disruptive behaviors, they can successfully harness their immense potential to lead others along thrilling, highly rewarding paths.
  
        """)

if user_personality_type == "ESFP":
    print("""
        The Entertainer (ESFP) personality type is defined by a vibrant, spontaneous, and deeply social approach to life. 
        Caught up in the excitement of the moment, these individuals love experiencing the unknown and possess an irresistible style that 
        naturally encourages others to join in. They have the strongest aesthetic sense of any type, easily identifying fashion, design, and beauty, 
        and they consistently transform ordinary get-togethers o lively celebrations.

        Thriving in the spotlight, Entertainers possess a unique knack for reading social situations and mirroring the behaviors of those around them. 
        They are observant and highly sensitive to others’ emotions, often serving as the first to offer warm emotional support and practical advice to a struggling friend. 
        However, when faced with personal conflict or criticism, they tend to compely avoid the issue rather than address it head-on, 
        preferring to keep their environment harmonious and lighthearted.

        This relentless focus on immediate pleasure roduces significant long-term challenges. Entertainers frequently struggle with repetitive tasks, 
        complex analyses, and long-term planning. Because they recognize quality but lack financial discipline, they are highly vulnerable to living beyond their means. 
        Their default state of leaping at spontaneous opportunities over tracking responsibilities can leave them feeling boxed in 
        by financial or situational consequences when those luxuries catch up to them.

        Ultimately, the ESFP is a generous powerhouse of laughter and playfulness. By challenging themselves to build structure and keep track of long-term goals, 
        they ensure they stay free to safely dive into all the exciting experiences the world has to offer.

        """)

