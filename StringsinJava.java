public class StringsinJava {
    public static void main(String[] args){


        // System.out.println( "Lowercase:" + fullName.toLowerCase );
        // System.out.println( "First Letter:" + fullName.charAt());
        // System.out.println( "Contains 'son': " + fullName.cont);
        //Working with substrings

        System.out.println("Working with substrings");
        String email = "gladysangela@gmail.com";
        int atIndex = email.indexOf( "@");
        String username = email.substring(0,atIndex);
        String domain = email.substring(atIndex + 1);

        System.out.println( "\nEmail Analysis:" );
        System.out.println( "Username:" + username);
        System.out.println( "Domain: " + domain);

        //Text Analyzer
        String text = "The quick brown fox jumps over  the lazy dog";
        System.out.println("Text Analysis System");
        System.out.println("======================");

        //Split the text into words
        String[] words = text.split("\\s+");
        //System.out.println(words[5]);

        System.out.println( "Word Analysis");
        System.out.println("Total words: "  + words.length);

        //Find the longest and shortest words 
        String longest = words[0];
        String shortest = words[0];

        for (String word : words){
            //System.out.println(word);
            if(word.length() > longest.length()){
            longest = word;
        }
        if(word.length() < shortest.length()){
            shortest = word;
    }
}
        System.out.println("Longest word: " + longest + "(" + longest.length() + " letters)");
        System.out.println("Shortest word: " + shortest + "(" + shortest.length() + " letters)");


    }
}
//next --? OOP(OOP.JAVA)