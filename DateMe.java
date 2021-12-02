public class DateMe {
    public static void main(String[] args) throws ParseException {
        //        java.util.Calendar c = java.util.Calendar.getInstance();
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        //        df.setTimeZone(TimeZone.getTimeZone("GMT+7"));
        //        c.add(Calendar.YEAR, 543);
                String currentDate = df.format(new Date());
                System.out.printf("currentDate " + currentDate);
        //        String currentDate = "02/12/2021 12:00:10";
        
                SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                df2.setTimeZone(TimeZone.getTimeZone("GMT+7"));
                System.out.println(df2.parse(currentDate));
        
                Date d1 = null;
                Calendar c = Calendar.getInstance();
                TimeZone thaiTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
        
                c.setTimeZone(thaiTimeZone);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                d1 = sdf.parse(currentDate);
                c.setTime(d1);
                System.out.println(d1);
            }
}