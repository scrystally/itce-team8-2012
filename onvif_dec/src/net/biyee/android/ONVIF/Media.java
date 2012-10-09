package net.biyee.android.ONVIF;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Namespace(reference="http://www.onvif.org/ver10/schema")
@Root(strict=false)
public class Media
{

  @Element
  public StreamingCapabilities StreamingCapabilities;

  @Element
  public String XAddr;
}

/* Location:           D:\setup\Android\Tools\classes_dex2jar.jar
 * Qualified Name:     net.biyee.android.ONVIF.Media
 * JD-Core Version:    0.6.0
 */