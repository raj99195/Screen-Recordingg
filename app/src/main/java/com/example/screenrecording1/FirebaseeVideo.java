package com.example.screenrecording1;

import static org.webrtc.VideoFrameDrawer.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import com.coloros.ocs.base.task.OnSuccessListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class FirebaseeVideo extends AppCompatActivity {


    private Button playButton;
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebasee_video);



       // playButton = findViewById(R.id.play_button);
        videoView = findViewById(R.id.video_view);

        playButton=findViewById(R.id.play_button);

        playButton.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              // Get a reference to the Firebase Storage location of the video
                                              // Get a reference to the Firebase Storage instance
                                              FirebaseStorage storage = FirebaseStorage.getInstance();
                                              StorageReference storageRef = storage.getReference();

// Get a reference to the video file
                                              StorageReference videoRef = storageRef.child("raj/videos.mp4");

                                              videoRef.getDownloadUrl().addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener<Uri>() {
                                                  @Override
                                                  public void onSuccess(Uri uri) {
                                                      VideoView videoView = findViewById(R.id.video_view);
                                                      videoView.setVideoURI(uri);
                                                      videoView.setVideoURI(uri);
                                                  }
                                              }).addOnFailureListener(new OnFailureListener() {
                                                  @Override
                                                  public void onFailure(@NonNull Exception e) {
                                                      Log.e(TAG, "Error downloading video: " + e.getMessage());
                                                  }
                                              });
                                          }
        });
    }
}


// Download the video and play it when the download is complete
