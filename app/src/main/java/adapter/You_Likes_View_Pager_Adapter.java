package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragment.You_Likes_Fragment;

/**
 * Created by wolfsoft3 on 12/9/18.
 */

public class You_Likes_View_Pager_Adapter extends FragmentStatePagerAdapter {

    int mnooftabs;

    public You_Likes_View_Pager_Adapter(FragmentManager fm, int mnooftabs) {
        super(fm);
        this.mnooftabs = mnooftabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                You_Likes_Fragment tab1 = new You_Likes_Fragment();
                return tab1;

            case 1:
                You_Likes_Fragment tab2 = new You_Likes_Fragment();
                return tab2;

            default:

                return null;
        }
    }

    @Override
    public int getCount() {
        return mnooftabs;
    }
}
