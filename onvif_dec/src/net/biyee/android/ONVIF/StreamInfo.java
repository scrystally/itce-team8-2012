package net.biyee.android.ONVIF;

import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Default(DefaultType.FIELD)
@Root(strict=false)
public class StreamInfo
{
  public String sAddress;

  @Element(required=false)
  public String sPassword;
  public String sProfileToken;
  public String sStreamURL;
  public String sUID;

  @Element(required=false)
  public String sUserName;
}

/* Location:           D:\setup\Android\Tools\classes_dex2jar.jar
 * Qualified Name:     net.biyee.android.ONVIF.StreamInfo
 * JD-Core Version:    0.6.0
 */