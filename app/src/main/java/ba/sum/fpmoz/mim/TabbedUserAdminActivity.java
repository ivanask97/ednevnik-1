package ba.sum.fpmoz.mim;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import ba.sum.fpmoz.mim.ui.main.adapters.TabbedAdapter;
import ba.sum.fpmoz.mim.ui.main.fragments.AddClassFragment;
import ba.sum.fpmoz.mim.ui.main.fragments.ListUsersFragment;
import ba.sum.fpmoz.mim.ui.main.fragments.AddUsersFragment;

public class TabbedUserAdminActivity extends AppCompatActivity {

    TabbedAdapter adapter;
    TabLayout layout;
    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed_user_admin);
        this.layout = findViewById(R.id.tabLayout);
        this.pager = findViewById(R.id.viewPager);

        this.adapter = new TabbedAdapter(getSupportFragmentManager(), 1);
        this.adapter.addFragment(
                new ListUsersFragment(), "Učenici"
        );

        this.adapter.addFragment(
                new AddUsersFragment(), "Korisnici+"
        );

        this.adapter.addFragment(
                new AddClassFragment(), "Razredi+"
        );
        this.pager.setAdapter(this.adapter);
        this.layout.setupWithViewPager(this.pager);

    }
}
