public class ServerNameGenerator {

    static String[] adjectives= {"Groovy", "Zany", "wacky", "quirky", "Bizarre", "Kooky", "Eccentric", "Offbeat", "Whimsical", "Freaky"};
    static String[] nouns = {"Pizza","Tacos","Sushi","Burgers","Ice Cream","Dumplings","Falafel","Pancakes","Noodles","Cake"};

    public static String genRand(){
        int i = (int)Math.floor(Math.random() * 10);
        int j = (int)Math.floor(Math.random() * 10);
        String adj = adjectives[i];
        String noun = nouns[j];
        String serverName = adj + "-" + noun;
        return serverName;
    }

    public static void main(String[] args) {
        System.out.println(genRand());
    }


}


