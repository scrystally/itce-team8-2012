package net.biyee.onvifer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TextView;
import net.biyee.android.ONVIF.Capabilities;
import net.biyee.android.ONVIF.GetDeviceInformationResponse;
import net.biyee.android.ONVIF.Imaging;
import net.biyee.android.ONVIF.ONVIFDevice;
import net.biyee.android.ONVIF.utilityONVIF;
import net.biyee.android.utility;

public class CapabilitiesImagingActivity extends Activity
{
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ONVIFDevice localONVIFDevice = utilityONVIF.getONVIFDevice(this, getIntent().getExtras().getString("param"));
    setContentView(2130903046);
    ((TextView)findViewById(2131296262)).setText(localONVIFDevice.sName + "(" + localONVIFDevice.di.Model + ")");
    ((TextView)findViewById(2131296263)).setText("Capabilities > Imaging");
    TableLayout localTableLayout = (TableLayout)findViewById(2131296266);
    if (localONVIFDevice.Capabilities.Imaging == null)
      utility.addTableRow(this, localTableLayout, "Imaging", "N/A");
    while (true)
    {
      return;
      utility.addTableRow(this, localTableLayout, "XAddr", localONVIFDevice.Capabilities.Imaging.XAddr);
    }
  }
}

/* Location:           D:\setup\Android\Tools\classes_dex2jar.jar
 * Qualified Name:     net.biyee.onvifer.CapabilitiesImagingActivity
 * JD-Core Version:    0.6.0
 */