import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        System.out.println(words);
        WordChecker x = new WordChecker(words);
        System.out.println(x.isWordChain());
        ArrayList<String> words2 = new ArrayList<String>();
        words2.add("to");
        words2.add("too");
        words2.add("stool");
        words2.add("tools");
        System.out.println(words2);
        WordChecker w = new WordChecker(words2);
        System.out.println(w.isWordChain());
    }

}
