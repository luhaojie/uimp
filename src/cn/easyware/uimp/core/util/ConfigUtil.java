package cn.easyware.uimp.core.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigUtil
{
    private Properties loadProperties(String fileName)
    {
        InputStream in = ConfigUtil.class.getClassLoader().getResourceAsStream(fileName);
        if (null == in)
        {
            throw new RuntimeException();
        }
        
        Properties p = new Properties();
        try
        {
            p.load(in);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (null != in)
            {
                try
                {
                    in.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
        return p;
    }
    
    public String getProperty(String key)
    {
        loadProperties("");
        String value = "";
        return value;
    }
}
