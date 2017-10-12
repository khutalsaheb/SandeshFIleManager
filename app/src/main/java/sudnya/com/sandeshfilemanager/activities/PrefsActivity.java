package sudnya.com.sandeshfilemanager.activities;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;



import java.util.List;

import sudnya.com.sandeshfilemanager.R;


/**@
 * Created by sandesh on 12/10/17.
 */
public class PrefsActivity extends PreferenceActivity {


    @Override
    public void onBuildHeaders(List<Header> target) {
        loadHeadersFromResource(R.xml.preference_headers, target);

    }

    @Override
    protected boolean isValidFragment(String fragmentName) {

        if(Header1.class.getName().equals(fragmentName))
            return true;

        return false;
    }

    public static class Header1 extends PreferenceFragment {

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.preference_common);
        }
    }


}
