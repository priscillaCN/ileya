import java.util.Scanner;

public class PersonalityTest {

    public static void main(String[] args) {

        System.out.println("\n\t\tMBTI PERSONALITY TEST");
        System.out.print("=====================================================\n");

        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your name? ");
        String userName = userInput.nextLine();

        System.out.println("\nHey " + userName + "!\nIt takes only 10 minutes to get a \"freakishly accurate\" description \nof who you are and why you do things the way you do!");
        System.out.println("\nINSTRUCTIONS");
        System.out.print("-------------------------------------");
        System.out.println("\nKindly answer A or B for all questions.\nYour result will be determined by your responses.\n\npress 1 to begin");

        int begin = userInput.nextInt();

        int question = 0;
        String options = "";

        String optionA = "";
        String optionB = "";

        while(begin != 1) {                
            System.out.println("\nI know this is an Error\nPlease press 1");
            begin = userInput.nextInt();
        }

        String [] selectedOptionsForSectionOne = new String [5];
        String userChoice = "";
        int count = 0;

        int numberOfAForSectionOne = 0;
        int numberOfBForSectionOne = 0;

        System.out.println("\n\nSECTION ONE");
        System.out.print("================================================\n");

        for(question = 1; question <= 5; question++) {

            switch (question) {

                case 1 -> {
                            optionA = "expend energy, enjoy groups";
                            optionB = "conserve energy, enjoy one-on-one";
                            options = "\nEXTROVERTED E VS INTROVERTED I\n\nA. " + optionA + "\t B. " + optionB;
                          }

                case 2 -> {
                            optionA = "more outgoing, think out loud";
                            optionB = "more reserved, think to yourself";
                            options = "\nA. " + optionA + "\t B. " +  optionB;
                          }

                case 3 -> {
                            optionA = "seek many tasks, public activities, interaction with others";
                            optionB = "seek private, solitary activities with quiet to concentrate";
                            options = "\nA. " + optionA + "\t B. " + optionB;
                          }

                case 4 -> {
                            optionA = "external, communicative, express yourself";
                            optionB = "internal, reticent, keep to yourself";
                            options = "\nA. " + optionA + "\t B. " + optionB;
                          }

                case 5 -> {
                            optionA = "active, initiate";
                            optionB = "reflective, deliberate";
                            options = "\nA. " + optionA + "\t B. " + optionB ;
                          }

            }

            System.out.println(options);      
            userChoice = userInput.next();

            if(userChoice.equalsIgnoreCase("A")) {
                selectedOptionsForSectionOne[count] = optionA;
                numberOfAForSectionOne++;
            }

            else if(userChoice.equalsIgnoreCase("B")) {
                selectedOptionsForSectionOne[count] = optionB; 
                numberOfBForSectionOne++;
            }

            else {
                System.out.println("\nI know this is an error.\nPlease enter A or B");
                question--;
                count--;
            }

            count++;

        }

        char [] userResultPerSection = new char [4];

        if(numberOfAForSectionOne > numberOfBForSectionOne) userResultPerSection[0] = 'E';
        else userResultPerSection[0] = 'I';

        String [] selectedOptionsForSectionTwo = new String [5];
        userChoice = "";
        count = 0;

        int numberOfAForSectionTwo = 0;
        int numberOfBForSectionTwo = 0;

        System.out.println("\nSECTION TWO");
        System.out.print("===============================================\n");

        for(question = 6; question <= 10; question++) {

            switch (question) {

                case 6 -> {
                            optionA = "interpret literally";
                            optionB = "look for meaning and possibilities";
                            options = "\nSENSING S VS INTUITIVE N\n\nA. " + optionA + "\t B. " + optionB;
                          }

                case 7 -> {
                            optionA = "practical, realistic, experiential";
                            optionB = "imaginative, innovative, theoretical";
                            options = "\nA. " + optionA + "\t B. " + optionB;
                          }

                case 8 -> {
                            optionA = "standard, usual, conventional";
                            optionB = "different, novel, unique";
                            options = "\nA. " + optionA + "\t B. " + optionB;
                        }

                case 9 -> {
                            optionA = "focus on here-and-now";
                            optionB = "look to the future, global perspective, big picture";
                            options = "\nA. " + optionA + "\t B. " + optionB;
                          }

                case 10 -> {
                            optionA = "facts, things, what is";
                            optionB = "ideas, dreams, what could be, philosophical";
                            options = "\nA. " + optionA + "\t B. " + optionB;
                          }

            }

            System.out.println(options);      
            userChoice = userInput.next();

            if(userChoice.equalsIgnoreCase("A")) {
                selectedOptionsForSectionTwo[count] = optionA;
                numberOfAForSectionTwo++;
            }

            else if(userChoice.equalsIgnoreCase("B")) {
                selectedOptionsForSectionTwo[count] = optionB; 
                numberOfBForSectionTwo++;
            }

            else {
                System.out.println("\nI know this is an error.\nPlease enter A or B");
                question--;
                count--;
            }

            count++;

        }

        if(numberOfAForSectionTwo > numberOfBForSectionTwo) userResultPerSection[1] = 'S';
        else userResultPerSection[1] = 'N';

        String [] selectedOptionsForSectionThree = new String [5];
        userChoice = "";
        count = 0;

        int numberOfAForSectionThree = 0;
        int numberOfBForSectionThree = 0;

        System.out.println("\nSECTION THREE");
        System.out.print("=============================================\n");

        for(question = 11; question <= 15; question++) {

            switch (question) {

                case 11 -> {
                            optionA = "logical, thinking, questioning";
                            optionB = "empathetic, feeling, accommodating";
                            options = "\nTHINKING T VS FEELING F\n\nA. " + optionA + "\t B. " + optionB;
                           }

                case 12 -> {
                            optionA = "candid, straight forward, frank";
                            optionB = "tactful, kind, encouraging";
                            options = "\n\nA. " + optionA + "\t B. " + optionB;
                           }

                case 13 -> {
                            optionA = "firm, tend to criticize, hold the line";
                            optionB = "gentle, tend to appreciate, conciliate";
                            options = "\n\nA. " + optionA + "\t B. " + optionB;
                           }

                case 14 -> {
                            optionA = "tough-minded, just";
                            optionB = "tender-hearted, merciful";
                            options = "\n\nA. " + optionA + "\t B. " + optionB;
                           }

                case 15 -> {
                            optionA = "matter of fact, issue-oriented";
                            optionB = "sensitive, people-oriented, compassionate";
                            options = "\n\nA. " + optionA + "\t B. " + optionB;
                           }

            }


            System.out.println(options);      
            userChoice = userInput.next();

            if(userChoice.equalsIgnoreCase("A")) {
                selectedOptionsForSectionThree[count] = optionA;
                numberOfAForSectionThree++;
            }

            else if(userChoice.equalsIgnoreCase("B")) {
                selectedOptionsForSectionThree[count] = optionB; 
                numberOfBForSectionThree++;
            }

            else {
                System.out.println("\nI know this is an error.\nPlease enter A or B");
                question--;
                count--;
            }

            count++;

        }

        if(numberOfAForSectionThree > numberOfBForSectionThree) userResultPerSection[2] = 'T';
        else userResultPerSection[2] = 'F';

        String [] selectedOptionsForSectionFour = new String [5];
        userChoice = "";
        count = 0;

        int numberOfAForSectionFour = 0;
        int numberOfBForSectionFour = 0;

        System.out.println("\nSECTION FOUR");
        System.out.print("============================================\n");

        for(question = 16; question <= 20; question++) {

            switch (question) {

                case 16 -> {
                            optionA = "organized, orderly";
                            optionB = "flexible, adaptable";
                            options = "\nJUDGING J VS PERCEPTIVE P\n\nA. " + optionA + "\t B. " + optionB;
                           }

                case 17 -> {
                            optionA = "plan, schedule";
                            optionB = "unplanned, spontaneous";
                            options = "\n\nA. " + optionA + "\t B. " + optionB;
                           }

                case 18 -> {
                            optionA = "regulated, structured";
                            optionB = "easy-going, live and let live";
                            options = "\n\nA. " + optionA + "\t B. " + optionB;
                           }

                case 19 -> {
                            optionA = "preparation, plan ahead";
                            optionB = "go with the flow, adapt as you go";
                            options = "\n\nA. " + optionA + "\t B. " + optionB;
                           }

                case 20 -> {
                            optionA = "control, govern";
                            optionB = "latitude, freedom";
                            options = "\n\nA. " + optionA + "\t B. " + optionB;
                           }

            }


            System.out.println(options);      
            userChoice = userInput.next();

            if(userChoice.equalsIgnoreCase("A")) {
                selectedOptionsForSectionFour[count] = optionA;
                numberOfAForSectionFour++;
            }

            else if(userChoice.equalsIgnoreCase("B")) {
                selectedOptionsForSectionFour[count] = optionB; 
                numberOfBForSectionFour++;
            }

            else {
                System.out.println("\nI know this is an error.\nPlease enter A or B");
                question--;
                count--;
            }

            count++;

        }

        if(numberOfAForSectionFour > numberOfBForSectionFour) userResultPerSection[3] = 'J';
        else userResultPerSection[3] = 'P';

        System.out.println("\nHello " + userName + ". You selected:");
        System.out.println("\nSECTION ONE");

        for(String selectedOptions : selectedOptionsForSectionOne) {
            System.out.println(selectedOptions);
        }
        
        System.out.println("\nNumber of A seleceted: " + numberOfAForSectionOne);
        System.out.println("Number of B seleceted: " + numberOfBForSectionOne);

        System.out.println("\nSECTION TWO");

        for(String selectedOptions : selectedOptionsForSectionTwo) {
            System.out.println(selectedOptions);
        }
        
        System.out.println("\nNumber of A seleceted: " + numberOfAForSectionTwo);
        System.out.println("Number of B seleceted: " + numberOfBForSectionTwo);

        System.out.println("\nSECTION THREE");

        for(String selectedOptions : selectedOptionsForSectionThree) {
            System.out.println(selectedOptions);
        }
        
        System.out.println("\nNumber of A seleceted: " + numberOfAForSectionTwo);
        System.out.println("Number of B seleceted: " + numberOfBForSectionTwo);

        System.out.println("\nSECTION FOUR");

        for(String selectedOptions : selectedOptionsForSectionFour) {
            System.out.println(selectedOptions);
        }
        
        System.out.println("\nNumber of A seleceted: " + numberOfAForSectionFour);
        System.out.println("Number of B seleceted: " + numberOfBForSectionFour);

        String userPersonalityType =new String(userResultPerSection);
        System.out.println("\nYour personality type is: " + userPersonalityType);

        System.out.println("press 1 to know more about " + userPersonalityType);
        int knowMore = userInput.nextInt();

        while(knowMore != 1) {                
            System.out.println("\nI know this is an Error\nPlease press 1");
            knowMore = userInput.nextInt();
        }

        if(userPersonalityType.equals("INTJ"))
            System.out.println("""
                                The Architect (INTJ) personality type is defined by a strategic, independent, and deeply logical approach to life.
                                Driven by an insatiable thirst for knowledge and continuous self-improvement,
                                these individuals apply a rare blend of intense creativity and straightforward rationality to everything they do.
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

                                """);

        if(userPersonalityType.equals ("INTP"))
            System.out.println("""
                                The Logician (INTP) personality type is defined by a flexible, analytical, and highly unconventional approach to life. 
                                Driven by an insatiable curiosity about the universe, these individuals possess a vigorous intellect 
                                and a natural knack for spotting patterns and discrepancies. 
                                They are imaginative, creative, and independent thinkers who are completely unafraid 
                                to step outside traditional boundaries to explore unique, untested paths.

                                Living largely within the vibrant world of their own minds, Logicians are prone to getting lost in deep thought, 
                                constantly debating ideas and theories from the moment they wake up. 
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
                                
                                """);

        if(userPersonalityType.equals("ENTJ"))
            System.out.println("""
                                The Commander (ENTJ) personality type is defined by a decisive, highly ambitious, and strategic approach to life. 
                                Characterized by a potent blend of charisma, confidence, and natural authority, 
                                these individuals are natural-born leaders who project an innate ability to rally crowds together behind a shared vision. 
                                They gather information to build creative long-term goals but rarely hesitate for long before taking action, 
                                driven by an intense desire for momentum and spectacular accomplishment.

                                Thriving on challenges, Commanders use sharp rationality and absolute willpower to push through obstacles where others might give up.
                                This relentless drive makes them brilliant entrepreneurs and powerful, unyielding negotiators who genuinely enjoy the psychological battle of wits. 
                                They deeply respect competence and possess a unique skill for recognizing talent in others, 
                                which helps them build highly effective teams to execute their visions.

                                However, this intensity can create significant interpersonal friction. In their single-minded pursuit of efficiency, 
                                Commanders may dismiss emotional displays as signs of weakness, occasionally calling out failures with a chilling degree of insensitivity. 
                                They run the risk of alienating the very teams they rely on by overlooking the emotional needs of their support network.

                                Ultimately, the ENTJ is a true powerhouse who cultivates a larger-than-life image.
                                By consciously combining their self-discipline and strategic strengths with an emotionally healthy focus, 
                                they can transform from merely dominant managers into inspiring leaders, securing both their desired victories and deep, satisfying relationships.
                                
                                """);

       if(userPersonalityType.equals ("ENTP"))
            System.out.println("""
                                The Debater (ENTP) personality type is defined by a bold, quick-witted, and highly creative approach to life. 
                                Characterized by immense mental agility, these individuals thrive on deconstructing and rebuilding concepts, 
                                constantly pushing past traditional boundaries. They are natural nonconformists who aren't afraid to question the status quo, 
                                frequently finding joy in verbal sparring and adopting a playful, contrarian sense of humor to test ideas.

                                Driven by an insatiable desire for innovation, Debaters act as ultimate devil's advocates, 
                                happily shredding arguments to see the world from different perspectives. They view blind conformity as a limitation, 
                                preferring to rethink standard assumptions and champion underdogs. However, their active minds constantly generate new theories, 
                                making it difficult to focus on implementation. They love the thrill of brainstorming big ideas 
                                but often struggle with the everyday grunt work required to turn visions into reality.

                                This relentless contrarianism can create significant friction in their personal and professional lives. 
                                In their pursuit of logic and rationality, they may inadvertently brush aside others' feelings, 
                                alienating colleagues or partners by turning casual conversations into intense debates. 
                                To achieve true success, they must learn that winning an argument is not always worth burning a bridge.

                                Ultimately, the ENTP is a visionary powerhouse with confidence and a keen sense of humor. 
                                By using their natural cognitive flexibility to cultivate sensitivity, they can learn when to compromise without losing their sharp, 
                                nonconformist edge, paving the way for deep, lasting relationships and meaningful real-world achievements.
                                
                                """);

        if(userPersonalityType.equals("INFJ"))
            System.out.println("""
                                The Advocate (INFJ) personality type is defined by a deeply thoughtful, idealistic, and compassionate approach to life.
                                Guided by a quiet, principled humanism, these rare individuals seek fulfillment not through wealth or status, 
                                but by standing up for what is right and acting as a force for good. They possess a rich inner vision and moving imagination, 
                                allowing them to balance the head and the heart to uplift others and correct societal injustices.

                                Far from being idle dreamers, Advocates are highly conscientious and driven by an intense commitment to integrity. 
                                They move through the world with a profound internal passion and an enormous capacity for empathy. 
                                Because they value deep, authentic connections, they prefer meaningful conversations over superficial small talk. 
                                They pour great care into their relationships, communicating with an emotional honesty that leaves a powerful impression on those around them.

                                However, this dedication comes with distinct internal challenges. Advocates often feel misunderstood or different from those around them, 
                                which can lead to isolation. Because they focus so intensely on their mission to fix the world's problems, they frequently neglect their own well-being. 
                                This selfless pattern makes them highly vulnerable to stress and burnout. 
                                Furthermore, they are incredibly sensitive to criticism and can take pushback deeply to heart when their good intentions go unappreciated.

                                Ultimately, the INFJ feels called to a unique life purpose. 
                                By learning to pause and extend the same compassion to themselves that they give to others, 
                                they can sustain their visionary strength and successfully achieve lasting, positive change.
                                
                                """);

        if(userPersonalityType.equals("INFP"))
            System.out.println("""
                                The Mediator (INFP) personality type is defined by a quiet, open-minded, and intensely imaginative approach to life. 
                                Guided by a deep sensitivity and a caring nature, these individuals possess a vibrant, passionate inner world. 
                                They are highly sentimental and nostalgic, frequently experiencing profound emotional responses to art, nature, and human connection. 
                                Brimming with idealism, they long for soulful relationships and feel a sincere calling to help others.

                                Empathy is the Mediator's greatest gift, allowing them to be compassionate, nonjudgmental listeners who genuinely yearn to understand the depths of human nature.
                                However, this deep empathy can also become a liability. Because they intimately feel the troubles of the world,
                                they are highly vulnerable to internalizing the negative moods of others. Without firm boundaries, they can easily become overwhelmed by a desire to fix every wrong.

                                Authenticity is paramount to an INFP, making them uneasy with anything that feels fake. They crave creative self-expression, 
                                often utilizing metaphors, writing, or art to share their innermost thoughts. While their rich daydreams are a beautiful source of innovation, 
                                they can lead to inaction. They frequently struggle with overthinking, intensely deliberating choices until the last possible moment, 
                                which can leave them feeling directionless or stuck.

                                Ultimately, the INFP thrives once they connect with a clear, focused sense of purpose. 
                                By learning to direct their creative energy rather than scattering it, they can pull themselves out of reflective ruts. 
                                Their quiet belief in doing the right thing naturally inspires compassion, kindness, and beauty wherever they go.
                                
                                """);

        if(userPersonalityType.equals("ENFJ"))
            System.out.println("""
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
                                
                                """);

        if(userPersonalityType.equals("ENFP"))
            System.out.println("""
                                The Campaigner (ENFP) personality type is defined by an energetic, openhearted, and deeply imaginative approach to life.
                                Characterized by a rare combination of carefree sociability and profound inner depth, these vibrant free spirits stand out in any crowd. 
                                They are driven by an intense desire for meaningful emotional connections and carry an unwavering belief that everything and everyone is fundamentally interconnected, 
                                always searching for magic and deeper significance in everyday moments.

                                When a fresh idea sparks their creativity, Campaigners radiate an infectious enthusiasm that naturally draws others to them, 
                                frequently elevating them into informal leadership roles. They are deeply curious about human relationships, 
                                using their natural warmth and empathy to create safe spaces where others feel comfortable opening up. 
                                They effortlessly balance a capacity for intense, introspective thought with a love for kicking back and seeking life's joyful pleasures.

                                However, this restless imagination introduces specific behavioral hurdles. Once the initial bloom of inspiration fades, 
                                Campaigners often struggle with self-discipline and long-term consistency, causing them to lose steam on projects before reaching the finish line. 
                                Additionally, their strong intuition can lead them to overanalyze other people's actions. Instead of seeking direct clarity, 
                                they may internalize social stress by puzzling over hidden motives or intentions.

                                Ultimately, the ENFP is an independent idealist guided by hope and goodwill. By learning to anchor their vast energy with consistency and clearer boundaries, 
                                they can successfully navigate their path, using their courage and empathy to light up the world around them.
                                
                                """);

        if(userPersonalityType.equals("ISTJ"))
            System.out.println("""
                                The Logistician (ISTJ) personality type is defined by a reserved, highly methodical, and rational approach to life. 
                                Characterized by a potent blend of integrity, responsibility, and unwavering dependability, these individuals serve as the steady backbone of their families and communities. 
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
                                
                                """);

        if(userPersonalityType.equals("ISFJ"))
            System.out.println("""
                                The Defender (ISFJ) personality type is defined by a warm, unassuming, and deeply responsible approach to life. 
                                Characterized by a potent blend of emotional sensitivity and excellent analytical abilities, these hardworking individuals thrive on 
                                giving careful attention to the practical details of daily life. They serve as true altruists, meeting deadlines, upholding traditions, 
                                and quietly operating behind the scenes to keep the world running smoothly without ever demanding the spotlight.

                                Loyalty is the Defender's greatest strength. They invest incredible energy into maintaining strong relationships, routinely dropping everything 
                                to lend a hand to a friend or family member in need. This deep desire to serve extends wholeheartedly to their employers and communities. 
                                However, their intense commitment can become a major liability, as less considerate individuals often take advantage of their helpful nature, 
                                leaving them overworked and heavily burned out.

                                Furthermore, Defenders possess an intense streak of perfectionism where "good enough" is rarely acceptable. 
                                They consistently go above and beyond to exceed expectations, yet their natural humility causes them to underplay their achievements. 
                                While they do not seek fame, they deeply crave genuine appreciation. When left unacknowledged, they struggle to stand up for themselves, 
                                which can cause them to quietly lose motivation and build internal resentment.

                                Ultimately, the ISFJ possesses a unique social talent for making others feel deeply seen, known, and cherished. 
                                By learning to overcome their fear of sudden change and extending the same care to themselves that they offer to others, 
                                they can protect their energy and continue building happy, secure lives for everyone around them.
                                
                                """);

        if(userPersonalityType.equals("ESTJ"))
            System.out.println("""
                                The Executive (ESTJ) personality type is defined by a highly organized, dedicated, and structured approach to life. 
                                Driven by principles of tradition and order, these natural leaders utilize their deep understanding of what is socially acceptable to bring families, 
                                communities, and workplaces together. They possess immense fortitude, consistently offering stable direction and sensible judgment amid adversity 
                                while confidently forging ahead on difficult paths without giving up under stress.

                                As model citizens, Executives lead by example, championing honesty, diligence, and an absolute rejection of cheating or laziness. Operating in a world of clear, 
                                verifiable facts, they dive headfirst into complex tasks, effortlessly sorting details and streamlining action plans to make massive projects 
                                feel manageable and approachable. They take massive pride in their reliability, considering it a personal duty to finish exactly what they start.

                                However, this relentless work ethic introduces distinct interpersonal hurdles. Executives expect their standards of excellence and 
                                commitment to be fiercely reciprocated. When partners or colleagues jeopardize a plan through perceived incompetence or laziness, 
                                they will not hesitate to voice their disappointment, earning them a reputation for inflexibility and stubbornness. 
                                Their strict focus on rules can blind them to unconventional approaches or creative solutions.

                                Ultimately, the ESTJ is a trustworthy powerhouse of efficiency and order. By learning to slow down and recognize that not everyone follows the same path, 
                                they can better integrate diverse viewpoints into their plans. This inclusive shift allows them to lead charges that work for everyone, securing lasting communal success.
                                
                                """);

        if(userPersonalityType.equals("ESFJ"))
            System.out.println("""
                                The Consul (ESFJ) personality type is defined by an attentive, outgoing, and deeply people-focused approach to life. 
                                Driven by strong communal values and a sense of duty, these social individuals serve as the bedrock of their neighborhoods and families. 
                                They find immense joy in hospitality, keeping everyone connected, and ensuring that those around them feel supported, celebrated, and completely secure.

                                As dedicated altruists, Consuls possess a clear moral compass based on tradition, protocols, and social norms. They memorize the smallest details of 
                                their loved ones' lives—never missing a birthday or milestone—and put enormous energy into hosting structured events where everyone feels special. 
                                They are happiest when they know they are needed and relied upon.

                                However, this fierce commitment to order and relationships presents personal challenges. Because they believe there is a single "right way"
                                to handle most situations, Consuls can become highly opinionated and judgmental toward those who choose alternative paths. 
                                They often take it deeply to heart if their extensive efforts go unappreciated, and they struggle immensely with the realization that 
                                they cannot control the choices or behaviors of others.

                                Ultimately, the ESFJ is a generous powerhouse of reliability and compassion. By learning to accept open-ended situations 
                                and respecting others' unique viewpoints, they can find true peace. They thrive best by leading through an example of genuine care, 
                                naturally bridging differences to bring diverse groups of people together.
 
                                """);

        if(userPersonalityType.equals("ISTP"))
            System.out.println("""
                                The Virtuoso (ISTP) personality type is defined by an individualistic, highly pragmatic, and hands-on approach to life. 
                                Characterized by a blend of casual curiosity and skepticism, these natural makers love exploring the physical world, dismantling mechanisms, 
                                and improving them through trial and error. They excel at direct problem-solving, preferring firsthand experience and working at their own pace 
                                over convoluted troubleshooting methods or predefined routines.

                                Operating with a powerful need for autonomy, Virtuosos march to the beat of their own drum, completely unbound by societal norms or conventions. 
                                While they appear calm and steady, they store an impulsive energy that can explode without warning, driving them to spontaneously pivot toward bold new interests. 
                                This direct nature makes them highly unpredictable to others, as they feel no qualms about walking away from situations that have lost their practical utility or excitement.
                                
                                However, this fierce independence introduces social challenges. Virtuosos generally find extensive socializing taxing, choosing small, 
                                meaningful interactions over superficial networking. Because they value efficiency and facts over social niceties, their straightforward communication style
                                is frequently misinterpreted as bluntness or insensitivity. They completely reject people-pleasing, which can accidentally alienate or 
                                frustrate colleagues and loved ones who require more emotional reassurance.

                                Ultimately, the ISTP is a genuine powerhouse of personal skill and adaptability. By finding an environment that respects their deep need for freedom, 
                                space, and unpredictability, they can beautifully balance their instinctual, rule-defying nature with satisfying real-world achievements.
                                
                                """);

        if(userPersonalityType.equals("ISFP"))
            System.out.println("""
                                The Adventurer (ISFP) personality type is defined by an open-minded, deeply expressive, and grounded approach to life. 
                                Viewing existence itself as a canvas for self-expression, these free-spirited individuals live fluidly in the present moment. 
                                They possess a remarkable ability to find beauty and joy in everyday experiences, navigating the world with a flexible, adaptable mindset 
                                that prioritizes personal autonomy and an infectiously encouraging attitude toward others.

                                Operating without strict schedules, Adventurers take each day as it comes, leaving ample room for spontaneous outings and unexpected discoveries. 
                                This flexible nature makes them exceptionally tolerant, compassionate, and nonjudgmental. They genuinely appreciate the diverse nature of humanity 
                                and rarely attempt to change others. However, this go-with-the-flow mentality can make it difficult to establish or stick to long-term plans, 
                                often leaving them with a cloudy view of their goals and a fear of letting people down.

                                In social circles, Adventurers are warm, friendly, and deeply caring companions who effortlessly pick up on unspoken emotions. 
                                They require dedicated alone time to recharge and anchor their identity, but they remain sensitive to criticism, deeply desiring approval 
                                and appreciation from those they cherish. Because they live firmly in the present, they rarely dwell on past hurts,
                                preferring to remain highly forgiving and open to giving second chances.

                                Ultimately, the ISFP is a humble artist of life who marches to the beat of their own drum. 
                                By introducing just a touch of structure to guide their independent spirit, they can comfortably transform their creative potentials into lasting, impactful realities.
                               
                                """);

        if(userPersonalityType.equals("ESTP"))
            System.out.println("""
                                The Entrepreneur (ESTP) personality type is defined by a vibrant, action-oriented, and highly spontaneous approach to life. 
                                Brimming with enthusiastic energy, these individuals thrive on navigating immediate realities and uncovering opportunities.
                                They are fiercely competitive and live firmly in the present moment, possessing a bold, brave spirit that is completely unafraid to take risks, 
                                act on impulse, or dive directly into the center of the action.

                                Abstract theories and prolonged discussions rarely hold an Entrepreneur’s interest. They prefer energetic conversations focused on real-world facts, 
                                often leaping into projects before they look and fixing mistakes as they go rather than sitting idle. This hands-on, rapid-fire rational stimulus response
                                makes regimented environments like formal schooling a massive challenge. Operating by their own moral compass, they view rules as 
                                flexible guidelines made to be broken to maximize exciting outcomes.

                                Socially, Entrepreneurs possess arguably the most perceptive, unfiltered view of any type. They have an uncanny knack for spotting tiny changes 
                                in their environment—such as a shift in someone's facial expression or habits—and will immediately call out these observations with straightforward directness. 
                                This rapid insight makes them exceptional group leaders and invaluable assets during fast-paced situations or emergencies, 
                                bringing life and colorful excitement wherever they go.

                                Ultimately, the ESTP is a natural powerhouse of momentum and charm. By focusing their abundant energy through tedious but necessary tasks 
                                and minimizing disruptive behaviors, they can successfully harness their immense potential to lead others along thrilling, highly rewarding paths.
                          
                                """);

        if(userPersonalityType.equals("ESFP"))
            System.out.println("""
                                The Entertainer (ESFP) personality type is defined by a vibrant, spontaneous, and deeply social approach to life. 
                                Caught up in the excitement of the moment, these individuals love experiencing the unknown and possess an irresistible style that 
                                naturally encourages others to join in. They have the strongest aesthetic sense of any type, easily identifying fashion, design, and beauty, 
                                and they consistently transform ordinary get-togethers into lively celebrations.

                                Thriving in the spotlight, Entertainers possess a unique knack for reading social situations and mirroring the behaviors of those around them. 
                                They are observant and highly sensitive to others’ emotions, often serving as the first to offer warm emotional support and practical advice to a struggling friend. 
                                However, when faced with personal conflict or criticism, they tend to completely avoid the issue rather than address it head-on, 
                                preferring to keep their environment harmonious and lighthearted.

                                This relentless focus on immediate pleasure introduces significant long-term challenges. Entertainers frequently struggle with repetitive tasks, 
                                complex analyses, and long-term planning. Because they recognize quality but lack financial discipline, they are highly vulnerable to living beyond their means. 
                                Their default state of leaping at spontaneous opportunities over tracking responsibilities can leave them feeling boxed in 
                                by financial or situational consequences when those luxuries catch up to them.

                                Ultimately, the ESFP is a generous powerhouse of laughter and playfulness. By challenging themselves to build structure and keep track of long-term goals, 
                                they ensure they stay free to safely dive into all the exciting experiences the world has to offer.
                                
                                """);

    }

}



