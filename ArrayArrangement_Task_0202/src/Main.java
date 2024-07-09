import java.util.*;

public class Main 
{
    public static void main(String[] args)
    {
        // ניצור את הרשימה שלנו ונגדיר את רשימת השמות

        String[] Animals  = {"dog", "pigeon", "cat", "caterpillar", "mouse"};

        // נדפיס את הרשימה שלנו לפני הסידור כדי שנוכל לראות ולהשוות

        System.out.println(Arrays.toString(Animals));

        // נשתמש בשתי לולאות פור הראשונה  עוברת על כל איבר במערך והשנייה עוברת על כל האיברים לאחר האיבר הנוכחי
        for (int i = 0; i < Animals.length; i++) 
        {
            for (int j = i + 1; j < Animals.length; j++) 
            {
                // בכל האיטרציה הלולאות משוות את אורכי שתי המחרוזות הנוכחיות

                if (Animals[i].length() < Animals[j].length()) 
                {
                    String x = Animals[i];

                    Animals[i] = Animals[j];

                    Animals[j] = x;
                }
                
                // אם המחרוזת הראשונה קצרה יותר מהשנייה מחליפים את המקומות שלהם במערך באמצעות משתנה זמני במקרה שלנו איקס
            }
        }

        // ולאחר שסידרנו נדפיס את הרשימה לאחר הסידור

        System.out.println(Arrays.toString(Animals));
    }
}
