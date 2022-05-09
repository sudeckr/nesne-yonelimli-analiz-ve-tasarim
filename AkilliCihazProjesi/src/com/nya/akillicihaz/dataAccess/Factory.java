package com.nya.akillicihaz.dataAccess;

public class Factory {

        public static IDataBaseAccess getVeritabani(String surucu)
        {
            IDataBaseAccess veriTabaniSurucusu = null;
            if(surucu.equalsIgnoreCase("postresql"))
            {
                veriTabaniSurucusu = new PostgresqlAccess();
            }
            return veriTabaniSurucusu;
        }

}
