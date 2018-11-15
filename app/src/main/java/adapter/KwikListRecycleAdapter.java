package adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.wolfsoft3.dating_app.Chat;
import com.example.wolfsoft3.dating_app.Invitation;
import com.example.wolfsoft3.dating_app.Looking_For_Romance;
import com.example.wolfsoft3.dating_app.Map_and_Navigation;
import com.example.wolfsoft3.dating_app.Navigation_drawer;
import com.example.wolfsoft3.dating_app.Plan;
import com.example.wolfsoft3.dating_app.Find_Your_Match;
import com.example.wolfsoft3.dating_app.Its_You;
import com.example.wolfsoft3.dating_app.Likes;
import com.example.wolfsoft3.dating_app.Login;
import com.example.wolfsoft3.dating_app.Make_Character;
import com.example.wolfsoft3.dating_app.Match;
import com.example.wolfsoft3.dating_app.Matches;
import com.example.wolfsoft3.dating_app.R;
import com.example.wolfsoft3.dating_app.Relationship;
import com.example.wolfsoft3.dating_app.Romantic_Relationship;
import com.example.wolfsoft3.dating_app.Send_Invitation;
import com.example.wolfsoft3.dating_app.Splash_Screen;
import com.example.wolfsoft3.dating_app.Your_Bedroom;
import com.example.wolfsoft3.dating_app.Your_Look;

import java.util.List;

import model.KwikListModelClass;


public class KwikListRecycleAdapter extends RecyclerView.Adapter<KwikListRecycleAdapter.MyViewHolder> {

    Context context;


    private List<KwikListModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView title;


        public MyViewHolder(View view) {
            super(view);

            title = (TextView) view.findViewById(R.id.title);


        }

    }


    public KwikListRecycleAdapter(Context context, List<KwikListModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_kwik_list, parent, false);


        return new MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        KwikListModelClass lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position == 0) {
                    Intent i = new Intent(context, Splash_Screen.class);
                    context.startActivity(i);
                } else if (position == 1) {
                    Intent i = new Intent(context, Login.class);
                    context.startActivity(i);
                } else if (position == 2) {
                    Intent i = new Intent(context, Make_Character.class);
                    context.startActivity(i);
                } else if (position == 3) {
                    Intent i = new Intent(context, Your_Look.class);
                    context.startActivity(i);
                } else if (position == 4) {
                    Intent i = new Intent(context, Your_Bedroom.class);
                    context.startActivity(i);
                } else if (position == 5) {
                    Intent i = new Intent(context, Its_You.class);
                    context.startActivity(i);
                } else if (position == 6) {
                    Intent i = new Intent(context, Navigation_drawer.class);
                    context.startActivity(i);
                } else if (position == 7) {
                    Intent i = new Intent(context, Find_Your_Match.class);
                    context.startActivity(i);
                } else if (position == 8) {
                    Intent i = new Intent(context, Map_and_Navigation.class);
                    context.startActivity(i);
                } else if (position == 9) {
                    Intent i = new Intent(context, Looking_For_Romance.class);
                    context.startActivity(i);
                } else if (position == 10) {
                    Intent i = new Intent(context, Match.class);
                    context.startActivity(i);
                } else if (position == 11) {
                    Intent i = new Intent(context, Invitation.class);
                    context.startActivity(i);
                } else if (position == 12) {
                    Intent i = new Intent(context, Romantic_Relationship.class);
                    context.startActivity(i);
                } else if (position == 13) {
                    Intent i = new Intent(context, Relationship.class);
                    context.startActivity(i);
                } else if (position == 14) {
                    Intent i = new Intent(context, Matches.class);
                    context.startActivity(i);
                } else if (position == 15) {
                    Intent i = new Intent(context, Chat.class);
                    context.startActivity(i);
                } else if (position == 16) {
                    Intent i = new Intent(context, Likes.class);
                    context.startActivity(i);
                } else if (position == 17) {
                    Intent i = new Intent(context, Plan.class);
                    context.startActivity(i);
                }else if (position == 18) {
                    Intent i = new Intent(context, Send_Invitation.class);
                    context.startActivity(i);
                }
            }

        });


    }


    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


