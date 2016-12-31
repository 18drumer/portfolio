package com.portfolio.hospitalfinder.naver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.nhn.android.maps.NMapActivity;
import com.nhn.android.maps.NMapView;

public class HospitalMapActivity extends NMapActivity  {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_hospital_map);
//    }
//
    private NMapView mMapView;// 지도 화면 View
    private final String CLIENT_ID = "GAbanOHF8FGXvDJN1v6s";// 애플리케이션 클라이언트 아이디 값

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMapView = new NMapView(this);
        setContentView(mMapView);
        mMapView.setClientId(CLIENT_ID); // 클라이언트 아이디 값 설정
        mMapView.setClickable(true);
        mMapView.setEnabled(true);
        mMapView.setFocusable(true);
        mMapView.setFocusableInTouchMode(true);
        mMapView.requestFocus();
    }
}
