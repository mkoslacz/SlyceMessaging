package it.slyce.messaging;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import uk.co.senab.photoview.PhotoViewAttacher;

public class ViewImageActivity extends AppCompatActivity {

    private PhotoViewAttacher mAttacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_image);

        Bundle extras = getIntent().getExtras();
        final String url = extras.getString("URL", null);
        final ImageView imageView = (ImageView) findViewById(R.id.image_view_large);
        if (url != null) {
            Glide.with(getApplicationContext()).load(url).into(imageView);
        }
        assert imageView != null;
        mAttacher = new PhotoViewAttacher(imageView);
        imageView.setOnLongClickListener(view -> {
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse(url));
            sendIntent.setType("image/*");
            startActivity(sendIntent);
            return false;
        });
    }
}
