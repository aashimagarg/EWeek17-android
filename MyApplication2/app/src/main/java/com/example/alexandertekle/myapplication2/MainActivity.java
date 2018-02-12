package com.example.alexandertekle.myapplication2;
// Android Custom ListView with Image and Text Tutorial with Example and Source Code
import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.alexandertekle.myapplication2.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.actions, menu);
        return true;
    }

    // Array of strings for ListView Title
    String[] listviewTitle = new String[]{"Addepar", "Airbnb", "Airware", "Akamai", "Amazon", "American Express",
            "Ancestry", "AppDynamics", "AppFolio", "Appian", "Apple", "AppNexus", "Atlassaian", "Barclays",
            "Beme", "Betterment", "Blackbaud", "Blend", "Bloomberg", "Bluebeam", "Boomerang", "Box", "Braintree",
            "BuildZoom", "Capital One", "ClearSlide", "Cogo",  "Couple",
            "Cruise", "Cumulus Networks", "Curalate", "Datadog","Delphix", "DE Shaw",   "DigitalOcean", "Docker",
            "DriveTime", "Dropbox",  "Ebay",  "Epic", "Esri", "Etsy", "Evernote", "Facebook", "Fidelity",
            "Figma", "Fitbit", "Flatiron", "Flipboard", "Foursquare", "Frog", "Galois", "Gigster","Github", "GoDaddy","Goldman Sachs", "Google", "Groupon",
            "GumGum",  "Gusto", "HomeAway", "HootSuite", "Houzz", "HP", "Hubspot",
            "Hulu", "IBM", "Infinera", "Intel", "Intuit", "Jane Street",
            "Karat", "Kayak", "Khan Academy", "Kinnek", "LastPass", "LendUp", "Lever", "LinkedIn", "LiveRamp", "Lob", "Logitech",
            "Lucid", "Lyft", "Lytx", "MailChimp", "Mathworks", "Medium", "Mesosphere", "Microsoft", "Mixmax",
            "MongoDB", "Mozilla", "MuleSoft", "Narrative Science", "Nest", "NextCapital", "Nextdoor", "Nvidida", "OfferUp",
            "Okta", "OpenAI", "Optimizely", "Oracle", "Oscar", "Palantir", "Pandora", "PayPal", "Percolate", "PhishMe", "Phosphorus",
            "Pinterest", "Pivotal", "Playstation", "Postmates", "Priceline", "Pure Storage", "Qualcomm", "Qualtrics", "Quantcast", "Quizlet",
            "Quora", "Rackspace", "Redbooth", "Reddit", "Redfin", "RedHat",  "RevolutionParts", "Riot Games", "Ripple", "Roblox", "Roku", "Rubrik",
            "Salesforce", "SendGrid", "Sensus", "Shiphawk", "Slack",  "SpaceX",
            "Spotify", "Sprout Social", "Square", "Squarespace", "Statefarm", "Stripe", "StudySoup", "SurveyMonkey", "Tableau", "Tendigi",
            "Teradata", "Tesla", "Thanx", "Thomson Reuters", "ThoughtSpot", "ThousandEyes", "Thumbtack", "Tinder",
            "Trello", "TripAdvisor", "Tumblr", "Twilio", "Twitch", "Twitter", "Two Sigma", "Uber", "Ultimate Software", "Unity", "Uptake", "Upwork",
            "USAA", "Valve", "Venmo", "Vizio", "Walmart Labs", "Walt Disney", "Wayfair", "Weebly",  "WeWork","WhatsApp", "WillowTree",
            "Workday", "Workiva", "Xero", "Yahoo", "Yelp", "Yext", "Zappos", "Zendesk", "Zenefits", "Zillow", "Zocdoc", "Zurb", "Zynga"};



    int[] listviewImage = new int[]{
            R.drawable.addepar, R.drawable.airbnb, R.drawable.airware, R.drawable.akamai, R.drawable.amazon, R.drawable.americanexpress,
            R.drawable.ancestry, R.drawable.appdynamics, R.drawable.appfolio, R.drawable.appian, R.drawable.apple,
            R.drawable.appnexus, R.drawable.atlassian, R.drawable.barclays, R.drawable.beme, R.drawable.betterment, R.drawable.blackbaud,
            R.drawable.blend, R.drawable.bloomberg,R.drawable.bluebeam,R.drawable.boomerang, R.drawable.box,
            R.drawable.braintree, R.drawable.buildzoom, R.drawable.capitalone, R.drawable.clearslide,R.drawable.cogo,R.drawable.couple,
            R.drawable.cruise,R.drawable.cumulus,R.drawable.curalate,R.drawable.datadog,R.drawable.delphix,R.drawable.deshaw,
            R.drawable.digitalocean,R.drawable.docker,R.drawable.drivetime,R.drawable.dropbox,R.drawable.ebay,R.drawable.epic,
            R.drawable.esri,R.drawable.etsy,R.drawable.evernote,R.drawable.facebook,R.drawable.fidelity,R.drawable.figma,
            R.drawable.fitbit,R.drawable.flatiron,R.drawable.flipboard,R.drawable.foursquare,R.drawable.frog,R.drawable.galois,
            R.drawable.gigster,R.drawable.github,R.drawable.godaddy,R.drawable.goldman,R.drawable.google,R.drawable.groupon,
            R.drawable.gumgum,R.drawable.gusto,R.drawable.homeaway,R.drawable.hootsuite,R.drawable.houzz,R.drawable.hp,
            R.drawable.hubspot,R.drawable.hulu,R.drawable.ibm,R.drawable.infinera,R.drawable.intel,R.drawable.intuit,R.drawable.janestreet,
            R.drawable.karat,R.drawable.kayak,R.drawable.khanacademy,R.drawable.kinnek,R.drawable.lastpass,R.drawable.lendup
            ,R.drawable.lever,R.drawable.linkedin,R.drawable.liveramp,R.drawable.lob,R.drawable.logitech,R.drawable.lucid,R.drawable.lyft,
            R.drawable.lytx,R.drawable.mailchimp,R.drawable.mathworks,R.drawable.medium,R.drawable.mesosphere,R.drawable.microsoft,
            R.drawable.mixwell,R.drawable.mongodb,R.drawable.mozilla,R.drawable.mulesoft,R.drawable.narrativescience,
            R.drawable.nest,R.drawable.nextcapital,R.drawable.nextdoor,R.drawable.nvidia, R.drawable.offerup,R.drawable.okta,
            R.drawable.openai,R.drawable.optimizely,R.drawable.oracle,R.drawable.oscar,R.drawable.palantir,R.drawable.pandora,
            R.drawable.paypal,R.drawable.percolate,R.drawable.phishme,R.drawable.phosphorus,R.drawable.pinterest,R.drawable.pivotal,
            R.drawable.playstation,R.drawable.postmates,R.drawable.priceline,R.drawable.purestorage,R.drawable.qualcomm,
            R.drawable.qualtrics,R.drawable.quantcast,R.drawable.quizlet,R.drawable.quora,R.drawable.rackspace,R.drawable.redbooth,R.drawable.reddit,R.drawable.redfin,R.drawable.redhat,R.drawable.revolutionparts,R.drawable.riotgames,
            R.drawable.ripple,R.drawable.roblox,R.drawable.roku,R.drawable.rubrik,R.drawable.salesforce,R.drawable.sendgrid,R.drawable.sensus,R.drawable.shiphawk,R.drawable.slack,R.drawable.spacex,R.drawable.spotify,R.drawable.sproutsocial,
            R.drawable.square,R.drawable.squarespace,R.drawable.statefarm,R.drawable.stripe,R.drawable.studysoup,R.drawable.surveymonkey,R.drawable.tableau,R.drawable.tendigi, R.drawable.teradata,R.drawable.tesla,R.drawable.thanx,
            R.drawable.thomsonreuters,R.drawable.thoughtspot,R.drawable.thousandeyes,R.drawable.thumbtack,R.drawable.tinder, R.drawable.trello, R.drawable.tripadvisor, R.drawable.tumblr,R.drawable.twilio, R.drawable.twitch,
            R.drawable.twitter, R.drawable.twosigma, R.drawable.uber, R.drawable.ultimatesoftware, R.drawable.unity, R.drawable.uptake, R.drawable.upwork,R.drawable.usaa,R.drawable.valve,R.drawable.venmo,R.drawable.vizio,
            R.drawable.walmartlabs,R.drawable.waltdisney,R.drawable.wayfair,R.drawable.weebly,R.drawable.wework,R.drawable.whatsapp,R.drawable.willowtree,R.drawable.workday,R.drawable.workiva,R.drawable.xero,R.drawable.yahoo,R.drawable.yelp,
            R.drawable.yext,R.drawable.zappos,R.drawable.zendesk,R.drawable.zenefits,R.drawable.zillow,R.drawable.zocdoc,R.drawable.zurb,R.drawable.zynga
    };


    String[] listviewShortDescription = new String[listviewTitle.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("length", ""+listviewTitle.length); //205
        Log.d("length", ""+listviewImage.length); //193
        //Log.d("length", ""+listviewImage.length);
        for (int i=0;i<listviewImage.length;i++)
        {
            listviewShortDescription[i]="Company, Internship Position, Description";
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < listviewImage.length; i++) {

            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("listview_title", listviewTitle[i]);
            hm.put("listview_discription", listviewShortDescription[i]);
            hm.put("listview_image", Integer.toString(listviewImage[i]));
            aList.add(hm);
        }

        String[] from = {"listview_image", "listview_title", "listview_discription"};
        int[] to = {R.id.listview_image, R.id.listview_item_title, R.id.listview_item_short_description};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.listview_activity, from, to);
        ListView androidListView = (ListView) findViewById(R.id.list_view);
        androidListView.setAdapter(simpleAdapter);
    }
}
