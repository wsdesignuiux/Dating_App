package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.wolfsoft3.dating_app.R;

import java.util.ArrayList;

import model.Item_Find_Your_Match_Model;
import model.Item_Matches_Model;


public class Item_Matches_Adapater extends RecyclerView.Adapter<Item_Matches_Adapater.ViewHolder> {

    private Context context;
    private ArrayList<Item_Matches_Model> modelArrayList;

    public Item_Matches_Adapater(Context context, ArrayList<Item_Matches_Model> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_matches,parent,false);
        return new ViewHolder(view);
    }

    @NonNull



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Item_Matches_Model item_matches_model = modelArrayList.get(position);

        holder.item_match_character_img.setImageResource(item_matches_model.getItem_match_character_img());


    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView item_match_character_img;

        public ViewHolder(View itemView) {
            super(itemView);

            item_match_character_img = itemView.findViewById(R.id.item_match_character_img);

        }
    }
}
