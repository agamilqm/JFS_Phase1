package utils;

public class FileHandlerUtils {

    public static void bubbleSortStringsAscending (String[] list){
        StringBuilder temp = new StringBuilder() ;
        int charTraverser ;
        for (int i = 0 ; i<list.length ; i++)
        {
            charTraverser=0;
            for(int j = 0 ; j< list.length -1-i ; j++)
            {
                while (list[j].charAt(charTraverser) == list[j+1].charAt(charTraverser))
                {
                    if (list[j].contains(list[j+1]) || list[j+1].contains(list[j])) {break;}
                    if ( (list[j].length()-1 == charTraverser) || (list[j+1].length()-1 == charTraverser)){break;}
                    charTraverser++;
                    System.out.println(charTraverser);

                }

                if ( list[j].charAt(charTraverser) > list[j+1].charAt(charTraverser) )
                {
                    temp = new StringBuilder(list[j]);
                    list[j]=list[j+1];
                    list[j+1] = String.valueOf(temp);
                }
            }
        }
    }



    public static String linerSearchStrings(String[] list,String fileName)
    {
        StringBuilder result = new StringBuilder();
        bubbleSortStringsAscending(list);
        for (var travers : list)
        {
            if (fileName.equals(travers))
            {
                result.append(travers);
                return "File "+result.toString()+" was found in the data base";
            }
        }
       return "File Not Found";
    }


}
