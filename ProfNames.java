public class ProfNames
{
  public int countNames(String[][]nameArray, String lastName)
  {
    String currentName = "";
    int total = 0;
    for(int row=0; row<nameArray.length;row++)
    {
      for(int column=0; column<nameArray[0].length;column++)
      {
        String surname = "";
        currentName = nameArray[row][column];
        for(int let=0; let<currentName.length(); let++)
        {
        surname +=currentName.charAt(let);
          if(surname.equals(lastName))
          {
            total++;
          }
          else
          {}
        }
      }
    }
    return total; 
  }
}