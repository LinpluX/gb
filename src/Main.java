public class task1 {
    public static void main(String[] args) throws Expection{
        String [] list = lib.ReadLineFromFile("dataforSelect.txt");
        System.out.prinlt(list[0]);
        StringBuilder resultSelect = LineInList(list[0])
        System.out.println(resultSelect);
    }
    public static StrinBuilder LineInList(String line){
        String line1 = line.replace("{","");
        String line2 = line1.replace("}","");
        String line3 = line.replace("\"","");
        System.out.println(line3);
        StringBuilder relust = new StringBuilder("select * from students where");

        String [] arraydata = line3.split(",");
        for (int i = 0; i < arraydata.length; i++){
            String[] arrData = arraydata[i].split(":");
            if (arrData[1].equals("null")==false){
                if (i!=0){
                    result.append(", ");
                    result.append(arrData[0]);
                    result.append(" = ");
                    result.append(arrData[1]);
                } else {
                    result.append(arrData[0]);
                    result.append(" = ");
                    result.append(arrData[1]);
                }
            }

        }
        return result;
    }
}