import java.util.ArrayList;
/**
 * Translates into Corpus or Grineer
 *
 * @author Alana Huitric
 * @version 1.0
 */
public class Translator
{
    /**
     * Constructor for objects of class Translator
     */
    public Translator()
    {
        
    }

     /**
     * Translates to Grineer
     *
     * @param  input  a input text
     * @return    lowercase string in Grineer
     */
    public String translateToGrineer(String input)
    {
        ArrayList<String> english = arrayify(input);
        ArrayList<String> grineer = new ArrayList<String>();
        boolean end = false;
        if (!english.get(english.size()-1).equals("."))
        {
            english.add(".");
            end = true;
        }
        for (int x = 0; x < english.size(); x++){
            if (english.get(x).equals("b"))
            {
                if(x+1 < english.size())
                {
                    if(english.get(x+1).equals("a"))
                    {
                        grineer.add("ra");
                        english.remove(x+1);
                    }
                    else if (english.get(x+1).equals("o"))
                    {
                        grineer.add("bro");
                        english.remove(x+1);
                    }
                    else
                    {
                        grineer.add("k");
                    }
                }
                else
                {
                    grineer.add("k");
                }
            }
            else if (english.get(x).equals("c"))
            {
                if(x+1 < english.size())
                {
                    if(english.get(x+1).equals("k"))
                    {
                        grineer.add("f");
                        english.remove(x+1);
                    }
                    else if (english.get(x+1).equals("l"))
                    {
                        grineer.add("gr");
                        english.remove(x+1);
                    }
                    else
                    {
                        grineer.add("k");
                    }
                }
                else
                {
                    grineer.add("k");
                }
            }
            else if (english.get(x).equals("d") || english.get(x).equals("h"))
            {
                grineer.add("r");
            }
            else if(english.get(x).equals("i"))
            {
                if(x - 1 >= 0)
                {
                    if(english.get(x-1).equals(" "))
                    {
                        grineer.add("hu");
                    }
                    else
                    {
                        grineer.add("u");
                    }
                }
                else
                {
                    grineer.add("u");
                }

            }
            else if(english.get(x).equals("l"))
            {
                if(x+1 < english.size())
                {
                    if(english.get(x+1).equals("l"))
                    {
                        grineer.add("s");
                        english.remove(x+1);
                    }
                    else
                    {
                        grineer.add("d");
                    }
                }
                else
                {
                    grineer.add("d");
                }
            }
            else if (english.get(x).equals("p"))
            {
                grineer.add("g");
            }
            else if(english.get(x).equals("r"))
            {
                if(x+1<english.size())
                {
                    if(!(english.get(x+1).equals(" ")||english.get(x+1).equals("?")||english.get(x+1).equals(".")||english.get(x+1).equals(",")||english.get(x+1).equals("!")))
                    {
                        grineer.add("gr");
                    }
                    else
                    {
                        grineer.add("r");
                    }
                }
                else
                {
                    grineer.add("r");
                }
            }
            else if(english.get(x).equals("o"))
            {

                if(x+1<english.size())
                {
                    if((english.get(x+1).equals(" ")||english.get(x+1).equals("?")||english.get(x+1).equals(".")||english.get(x+1).equals(",")||english.get(x+1).equals("!")))
                    {
                        if(x - 2 >= 0)
                        {
                            if (english.get(x-2).equals("n") && english.get(x-1).equals("n"))
                            {
                                grineer.add("o");
                            }
                            else
                            {
                                grineer.add("u");
                            }
                        }
                        else
                        {
                            grineer.add("u");

                        }
                    }
                    else
                    {
                        grineer.add("o");
                    }
                }
                else
                {
                    grineer.add("o");
                }
            }
            else if(english.get(x).equals("s"))
            {
                if(x+1 < english.size())
                {
                    if(english.get(x+1).equals("t"))
                    {
                        grineer.add("tr");
                        english.remove(x+1);
                    }
                    else
                    {
                        grineer.add("s");
                    }
                }
                else
                {
                    grineer.add("s");
                }
            }
            else if(english.get(x).equals("t"))
            {
                if(x+1 < english.size())
                {
                    if(english.get(x+1).equals("h"))
                    {
                        grineer.add("kl");
                        english.remove(x+1);
                    }
                    else
                    {
                        grineer.add("t");
                    }
                }
                else
                {
                    grineer.add("t");
                }
            }
            else if(english.get(x).equals("w"))
            {
                if(x+1 < english.size())
                {
                    if(english.get(x+1).equals("h"))
                    {
                        grineer.add("gr");
                        english.remove(x+1);
                    }
                    else
                    {
                        grineer.add("r");
                    }
                }
                else
                {
                    grineer.add("r");
                }
            }
            else
            {
                grineer.add(english.get(x));
            }
        }
        if (end == true)
        {
            grineer.remove(grineer.size()-1);
        }
        return stringify(grineer);
    }
    
     /**
     * Translates to Corpus
     *
     * @param  input  a input text
     * @return    lowercase string in Corpus
     */
    public String translateToCorpus(String input)
    {
        ArrayList<String> english = arrayify(input);
        ArrayList<String> corpus = new ArrayList<String>();
        boolean end = false;
        if (!english.get(english.size()-1).equals("."))
        {
            english.add(".");
            end = true;
        }
        for (int x = 0; x < english.size(); x++)
        {
            if (english.get(x).equals("b"))
            {
                corpus.add("t");
            }
            else if(english.get(x).equals("c"))
            {
                corpus.add("y");
            }
            else if(english.get(x).equals("d"))
            {
                corpus.add("p");
            }
            else if(english.get(x).equals("f"))
            {
                corpus.add("t");
            }
            else if(english.get(x).equals("g"))
            {
                corpus.add("j"); //may not be that accurate for soft g sounds
            }
            else if(english.get(x).equals("h"))
            {
                corpus.add("k");
            }
            else if(english.get(x).equals("j"))
            {
                corpus.add("t");
            }
            else if(english.get(x).equals("l"))
            {
                corpus.add("p");
            }
            else if(english.get(x).equals("m"))
            {
                corpus.add("s");
            }
            else if(english.get(x).equals("n"))
            {
                corpus.add("t");
            }
            else if(english.get(x).equals("p"))
            {
                corpus.add("k");
            }
            else if(english.get(x).equals("q"))
            {
                corpus.add("r");
            }
            else if(english.get(x).equals("r"))
            {
                corpus.add("t");
            }
            else if(english.get(x).equals("s"))
            {
                corpus.add("y");
            }
            else if(english.get(x).equals("t"))
            {
                corpus.add("p");
            }
            else if(english.get(x).equals("v"))
            {
                corpus.add("t");
            }
            else if(english.get(x).equals("w"))
            {
                corpus.add("j");
            }
            else if(english.get(x).equals("z"))
            {
                corpus.add("b");
            }
            else
            {
                corpus.add(english.get(x));
            }
        }
        if (end == true)
        {
            corpus.remove(corpus.size()-1);
        }
        return stringify(corpus);
    }
    
     /**
     * Turns a string into an arraylist of single substrings
     *
     * @param  str  input string
     * @return    an arraylist of substrings
     */
    public ArrayList<String> arrayify(String str)
    {
        ArrayList<String> arrStr = new ArrayList<String>();
        for (int x = 0; x < str.length(); x++)
        {
            arrStr.add(str.substring(x, x+1));
        }
        return arrStr;
    }
    
     /**
     * Probably unnecessary but that's okay this turns an arraylist into a string
     *
     * @param  arrString  an arraylist of strings
     * @return    String  concatenated arraylist
     */
    public String stringify(ArrayList<String> arrString)
    {
        StringBuffer sb = new StringBuffer();
        for (String letter: arrString){
            sb.append(letter);
        }
        return sb.toString();
    }

}
