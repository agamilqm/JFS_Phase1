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
                    charTraverser++;
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


}
