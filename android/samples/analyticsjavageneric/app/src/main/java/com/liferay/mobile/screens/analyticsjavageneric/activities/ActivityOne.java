package com.liferay.mobile.screens.analyticsjavageneric.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.liferay.analytics.client.impl.AnalyticsClientImpl;
import com.liferay.analytics.model.AnalyticsEventsMessage;
import com.liferay.mobile.screens.analyticsjavageneric.R;

public class ActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        try {
            sendAnalytics("ActivityOne_OnCreate", "sarai.diaz");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendAnalytics(String analyticsKey, String userId) throws Exception {
        AnalyticsEventsMessage.Builder analyticsEventsMessageBuilder = AnalyticsEventsMessage.builder(analyticsKey, userId);

        analyticsEventsMessageBuilder.contextProperty("languageId", "en_US");
        analyticsEventsMessageBuilder.contextProperty("url", "http://www.liferay.com");

        AnalyticsEventsMessage.Event.Builder eventBuilder = AnalyticsEventsMessage.Event.builder("ApplicationId", "View");

        eventBuilder.property("elementId", "banner1");

        analyticsEventsMessageBuilder.event(eventBuilder.build());

        analyticsEventsMessageBuilder.protocolVersion("1.0");

        AnalyticsClientImpl analyticsClientImpl = new AnalyticsClientImpl();

        analyticsClientImpl.sendAnalytics(analyticsEventsMessageBuilder.build());
    }
}
