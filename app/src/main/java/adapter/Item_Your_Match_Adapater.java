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



public class Item_Your_Match_Adapater extends RecyclerView.Adapter<Item_Your_Match_Adapater.ViewHolder> {

    private Context context;
    private ArrayList<Item_Find_Your_Match_Model> modelArrayList;

    public Item_Your_Match_Adapater(Context context, ArrayList<Item_Find_Your_Match_Model> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_find_your_match,parent,false);
        return new ViewHolder(view);
    }

    @NonNull



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Item_Find_Your_Match_Model item_find_your_match_model = modelArrayList.get(position);

        holder.match_image.setImageResource(item_find_your_match_model.getMatch_image());


    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView match_image;

        public ViewHolder(View itemView) {
            super(itemView);

            match_image = itemView.findViewById(R.id.match_image);

        }
    }
}
