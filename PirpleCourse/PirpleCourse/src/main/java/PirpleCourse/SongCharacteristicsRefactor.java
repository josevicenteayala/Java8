/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PirpleCourse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * This class correspond to four assignment.
 * @author vin001
 */
public class SongCharacteristicsRefactor {
    /**
     * This method let to execute the main code of this class
     * @param args
     */
    public static void main(String[] args) {
        String name = "Wish you were here";
        String producer = "Pink Floyd";
        String recorded = "12 September 1975";
        String studioName = "Abbey Road";
        String genre = "Progressive rock";
        String albumLength = "44:11";
        String author = "Roger Waters";
        int year = 1975;
        String length = "5:35";
        
        /*These are some characteristics about a song named --Wish you be here--*/
        Map<String,String> myFavoriteSong = new HashMap<String,String>();
        myFavoriteSong.put(NAME, name);
        myFavoriteSong.put(PRODUCER, producer);
        myFavoriteSong.put(RECORDED, recorded);
        myFavoriteSong.put(STUDIO_NAME, studioName);
        myFavoriteSong.put(GENRE, genre);
        myFavoriteSong.put(ALBUM_LENGHT, albumLength);
        myFavoriteSong.put(AUTHOR, author);
        myFavoriteSong.put(YEAR, String.valueOf(year));
        myFavoriteSong.put(LENGTH, length);
        
        Set<String> keys = myFavoriteSong.keySet();
        
        for(String key : keys){
           String characteristic = String.format("The %1$s is %2$s", key, myFavoriteSong.get(key));
           System.out.println(characteristic);
        }
    }
    
    public static final String LENGTH = "length";
    public static final String YEAR = "year";
    public static final String AUTHOR = "author";
    public static final String ALBUM_LENGHT = "albumLenght";
    public static final String GENRE = "genre";
    public static final String STUDIO_NAME = "studioName";
    public static final String RECORDED = "recorded";
    public static final String PRODUCER = "producer";
    public static final String NAME = "name";
    
}
