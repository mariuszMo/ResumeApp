package pl.mariuszmondal.resume;

import android.content.Context;
import android.os.CountDownTimer;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import pl.mariuszmondal.resume.Model.Contact.CVModel;

/**
 * Created by Mondi on 11.04.2017.
 */

public class FragmentContactRecyclerView extends RecyclerView.Adapter<FragmentContactRecyclerView.CustomViewViewHolder> {
    private ArrayList<CVModel> cvModelArrayList;
    private Context context;
    private CountDownTimer countDownTimer;

    public FragmentContactRecyclerView(ArrayList<CVModel> cvModelArrayList, Context context) {
        this.context = context;
        this.cvModelArrayList = cvModelArrayList;
    }


    @Override
    public FragmentContactRecyclerView.CustomViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custow_view, parent, false);

        return new FragmentContactRecyclerView.CustomViewViewHolder(v) {
        };
    }


    @Override
    public void onBindViewHolder(final FragmentContactRecyclerView.CustomViewViewHolder holder, int position) {
        final CVModel CVModel;
        CVModel = cvModelArrayList.get(position);
        holder.icon.setImageResource(CVModel.getIconId());
        holder.infoField.setText(CVModel.getTextField());
        holder.infoValue.setText(CVModel.getInfoField());
        holder.roundCornerProgressBar.setVisibility(View.GONE);
        //CVModel.performAction(context);
        // holder.cardView.setliste
        countDownTimer = new CountDownTimer(1000, 10)
        {
            @Override
            public void onTick(long millisUntilFinished) {
                // holder.roundCornerProgressBar.invalidate();
                holder.roundCornerProgressBar.setProgress(100 - millisUntilFinished / 10);
                ;
//                        percentProgress++;
            }

            @Override
            public void onFinish() {
                holder.roundCornerProgressBar.setVisibility(View.GONE);
                Log.e("DUPA", "sfsd");
                CVModel.performAction(context);

            }};
        holder.cardView.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {

//TODO: RXjava

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        holder.roundCornerProgressBar.setVisibility(View.VISIBLE);
                        countDownTimer.start();
//                    float percentProgress = 0;


                        break;
                    case MotionEvent.ACTION_UP:
                        if (countDownTimer != null) {
                            Log.e("DUPA","cancel");
                            countDownTimer.cancel();

                        }
                        holder.roundCornerProgressBar.setVisibility(View.GONE);

                        break;
                    default: {
                    }
                }
                return false;
            }

            ;
        });

    }

    @Override
    public int getItemCount() {
        return cvModelArrayList.size();
    }

    static class CustomViewViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.custom_view_image)
        ImageView icon;
        @BindView(R.id.custom_view_info_field)
        TextView infoField;
        @BindView(R.id.custom_view_info_value)
        TextView infoValue;
        @BindView(R.id.custom_view_progress_bar)
        com.akexorcist.roundcornerprogressbar.RoundCornerProgressBar roundCornerProgressBar;

        @BindView(R.id.card_view)
        CardView cardView;


        public CustomViewViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);

        }
    }

}
