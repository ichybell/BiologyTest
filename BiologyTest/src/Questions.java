import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ConcurrentNavigableMap;

public class Questions {
    public static int i = 0;
    public static void question() {
        System.out.println("Question 1: \nThe light reaction of photosynthesis does not include:" +
                "\n A: Chemiosmosis" +
                "\n B: Oxygen Liberation:" +
                "\n C: Charge separation" +
                "\n D: Electron transport");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.next();
        response =response.toUpperCase();
        switch (response) {
            case "B":
                i++;
                System.out.println("\t\nCorrect Answer");
                break;
            default:
                System.out.println("\t\nWrong answer: The answer is B");
        }
        System.out.println("\nQuestion 2: \nThe final product of the Calvin cycle is" +
                "\n A: RuPB" +
                "\n B: PGA" +
                "\n C: ATP" +
                "\n D: G3P");
        String response1 = scanner.next();
        response1 =response1.toUpperCase();
        switch (response1) {
            case "D":
                i++;
                System.out.println("\t\nCorrect Answer");
                break;
            default:
                System.out.println("\t\nWrong answer: The answer is D");
        }
        System.out.println("\nQuestion 3: \nPhotosynthesis takes place in the membranes of small sacs called" +
                "\n A: thylakoids" +
                "\n B: grana" +
                "\n C: photosystems" +
                "\n D: photons");
        String response2 = scanner.next();
        response2 =response2.toUpperCase();
        switch (response2) {
            case "A":
                i++;
                System.out.println("\t\nCorrect Answer");
                break;
            default:
                System.out.println("\t\nWrong answer: The answer is A");
        }
        System.out.println("\nQuestion 4: \nThe dark reaction in photosynthesis is limited by" +
                "\n A: CO2, temperature, and light" +
                "\n B: CO2, light, and water" +
                "\n C: water, temperature, and CO2" +
                "\n D: oxygen, water, and temperature");
        String response3 = scanner.next();
        response3 =response3.toUpperCase();
        switch (response3) {
            case "A":
                i++;
                System.out.println("\t\nCorrect Answer");
                break;
            default:
                System.out.println("\t\nWrong answer: The answer is A");
        }
        System.out.println("\nQuestion 5: \nDuring what stage of photosynthesis is O2 produced?" +
                "\n A: Cyclic photophosphorylation" +
                "\n B: The light-dependent reactions involving photosystems I and II" +
                "\n C: Carbon fixation" +
                "\n D: The Krebs cycle");
        String response4 = scanner.next();
        response4 =response4.toUpperCase();
        switch (response4) {
            case "B":
                i++;
                System.out.println("\t\nCorrect Answer");
                break;
            default:
                System.out.println("\t\nWrong answer: The answer is B");
        }
        System.out.println("\nQuestion 6: \nBoth carotenoids and chlorophylls" +
                "\n A: are pigments" +
                "\n B: absorb photons of all energy ranges" +
                "\n C: contain porphyrin rings" +
                "\n D: all of the above");
        String response5 = scanner.next();
        response5 =response5.toUpperCase();
        switch (response5) {
            case "A":
                i++;
                System.out.println("\t\nCorrect Answer");
                break;
            default:
                System.out.println("\t\nWrong answer: The answer is A");
        }
        System.out.println("\nQuestion 7: \nWhich of the following is the correct sequence" +
                " for the movement of electrons during the light-dependent reactions of plants?" +
                "\n A: P680 à P700 à water à NADP+" +
                "\n B: water à P700 à NADP+à P680" +
                "\n C: P700 à P680 à NADP+à water" +
                "\n D: water à P680 à P700 à NADP+");
        String response6 = scanner.next();
        response6 =response6.toUpperCase();
        switch (response6) {
            case "D":
                i++;
                System.out.println("\t\nCorrect Answer");
                break;
            default:
                System.out.println("\t\nWrong answer: The answer is D");
        }
        System.out.println("\nQuestion 8: \nWhat pigment is used in human vision?" +
                "\n A: chlorophyll a" +
                "\n B: beta-carotene" +
                "\n C: retinal" +
                "\n D: vitamin A");
        String response7 = scanner.next();
        response7 =response7.toUpperCase();
        switch (response7) {
            case "C":
                i++;
                System.out.println("\t\nCorrect Answer");
                break;
            default:
                System.out.println("\t\nWrong answer: The answer is C");
        }
        System.out.println("\nQuestion 9: \nDuring what stage of photosynthesis are ATP and NADPH converted to ADP + Pi and NADP+" +
                "\n A: the light dependent reaction" +
                "\n B: the light-independent reactions" +
                "\n C: both of the above" +
                "\n D: none of the above");
        String response8 = scanner.next();
        response8 =response8.toUpperCase();
        switch (response8) {
            case "B":
                i++;
                System.out.println("\t\nCorrect Answer");
                break;
            default:
                System.out.println("\t\nWrong answer: The answer is B");
        }
        System.out.println("\nQuestion 10: \nWater vapor exits and CO2 enters a leaf through the" +
                "\n A: stomata" +
                "\n B: grana" +
                "\n C: poryphrin rings" +
                "\n D: photons");
        String response9 = scanner.next();
        response9 =response9.toUpperCase();
        switch (response9) {
            case "A":
                i++;
                System.out.println("\t\nCorrect Answer");
                break;
            default:
                System.out.println("\t\nWrong answer: The answer is A");
        }
        System.out.println("\nQuestion 11: \nWhich of the following organisms have the greatest problem with photorespiration?" +
                "\n A: C4 plants" +
                "\n B: Heterotrophs" +
                "\n C: C3 plants" +
                "\n D: CAM plants");
        String response10 = scanner.next();
        response10 =response10.toUpperCase();
        switch (response10) {
            case "C":
                i++;
                System.out.println("\t\nCorrect Answer");
                break;
            default:
                System.out.println("\t\nWrong answer: The answer is C");
        }
        System.out.println("\nQuestion 12: \nWhat energy-rich organic compound is produced as a result of the Calvin cycle?" +
                "\n A: NADPH" +
                "\n B: CO2" +
                "\n C: ATP" +
                "\n D: glucose");
        String response11 = scanner.next();
        response11 =response11.toUpperCase();
        switch (response11) {
            case "D":
                i++;
                System.out.println("\t\nCorrect Answer");
                break;
            default:
                System.out.println("\t\nWrong answer: The answer is D");
        }
        System.out.println("\nQuestion 13: \nHigh-energy photons" +
                "\n A: have long wavelengths" +
                "\n B: have short wavelengths" +
                "\n C: are more likely to produce red light than blue light" +
                "\n D: cannot be absorbed");
        String response12 = scanner.next();
        response12 = response12.toUpperCase();
        switch (response12) {
            case "B":
                i++;
                System.out.println("\t\nCorrect Answer");
                break;
            default:
                System.out.println("\t\nWrong answer: The answer is B");
        }
        System.out.println("\nQuestion 14: \nLight that is visible to humans occupies what part of the electromagnetic spectrum?" +
                "\n A: the entire upper half" +
                "\n B: the entire lower half" +
                "\n C: a small portion in the middle" +
                "\n D: the entire spectrum");
        String response13 = scanner.next();
        response13 =response13.toUpperCase();
        switch (response13) {
            case "C":
                i++;
                System.out.println("\t\nCorrect Answer");
                break;
            default:
                System.out.println("\t\nWrong answer: The answer is C");
        }
        System.out.println("\nQuestion 15: \nDuring photosynthesis, photons raise electrons to higher energy levels." +
                " These excited electrons belong to what compound?" +
                "\n A: H2O" +
                "\n B: ATP" +
                "\n C: RuBP" +
                "\n D: chlorophyll");
        String response14 = scanner.next();
        response14 =response14.toUpperCase();
        switch (response14) {
            case "D":
                i++;
                System.out.println("\t\nCorrect Answer");
                break;
            default:
                System.out.println("\t\nWrong answer: The answer is D");
        }
        System.out.println("\nQuestion 16: \nWhich of the following occurs during the light-dependent reactions of plants?" +
                "\n A: electron transport" +
                "\n B:chemiosmosis" +
                "\n C: splitting of water" +
                "\n D: all of the above\n");
        String response15 = scanner.next();
        response15 =response15.toUpperCase();
        switch (response15) {
            case "D":
                i++;
                System.out.println("\t\nCorrect Answer");
                break;
            default:
                System.out.println("\t\nWrong answer: The answer is D");
        }
        System.out.println("\nQuestion 17: \nThe oxygen that is released as O2 during photosynthesis came from _____________ molecules." +
                "\n A: carbon dioxide" +
                "\n B: water" +
                "\n C: glucose" +
                "\n D: chlorophyll");
        String response16 = scanner.next();
        response16 =response16.toUpperCase();
        switch (response16) {
            case "B":
                i++;
                System.out.println("\t\nCorrect Answer");
                break;
            default:
                System.out.println("\t\nWrong answer: The answer is B");
        }
        System.out.println("\nQuestion 18: \nCompared to retinal, chlorophyll can be described as a pigment that has a" +
                "\n A: narrow absorption range but high efficiency" +
                "\n B: narrow absorption range but low efficiency" +
                "\n C: wide absorption range but high efficiency" +
                "\n D: wide absorption range but low efficiency");
        String response17 = scanner.next();
        response17 =response17.toUpperCase();
        switch (response17) {
            case "A":
                i++;
                System.out.println("\t\nCorrect Answer");
                break;
            default:
                System.out.println("\t\nWrong answer: The answer is A");
        }
        System.out.println("\nQuestion 19: \nThe earliest photosynthesizers probably used what as a source of hydrogen?" +
                "\n A: H2S" +
                "\n B: H2O" +
                "\n C: CO2" +
                "\n D: C6H12O6");
        String response18 = scanner.next();
        response18 =response18.toUpperCase();
        switch (response18) {
            case "A":
                i++;
                System.out.println("\t\nCorrect Answer");
                break;
            default:
                System.out.println("\t\nWrong answer: The answer is A");
        }
        System.out.println("\nQuestion 20: \nProduction of one molecule of 3-phosphoglyceraldehyde requires how many turns of the Calvin cycle?" +
                "\n A: 1" +
                "\n B: 2" +
                "\n C: 3" +
                "\n D: 6");
        String response19 = scanner.next();
        response19 =response19.toUpperCase();
        switch (response19) {
            case "C":
                i++;
                System.out.println("\t\nCorrect Answer");
                break;
            default:
                System.out.println("\t\nWrong answer: The answer is C");
        }
        System.out.println("\nCongratulations on completing your test. Your final grade is " +i);
    }
}
