package com.bluetech.androidbasicapp.data.source.local.mock

import com.bluetech.androidbasicapp.domain.model.NewsArticle
import com.google.gson.Gson


fun getMockArticle() = Gson().fromJson(getJsonResponse(), NewsArticle::class.java)

//mocking the response from server
private fun getJsonResponse(): String {
    return """{
  "status": "ok",
  "totalResults": 32128,
  "articles": [
    {
      "source": {
        "id": null,
        "name": "Lifehacker.com"
      },
      "author": "Sachin Bahal",
      "title": "All the New Android 14 Features Google Announced Today",
      "description": "Made by Google 2023 is officially here, and with it, exciting product announcements. We’ve now gotten our eyes on the Pixel 8 and Pixel 8 Pro, the Pixel Watch 2, and two new colors for Pixel Buds Pro. But it’s not all about hardware: Google also officially in…",
      "url": "https://lifehacker.com/best-new-features-android-14-1850897684",
      "urlToImage": "https://i.kinja-img.com/image/upload/c_fill,f_auto,fl_progressive,g_center,h_675,pg_1,q_80,w_1200/e94f235617386d7799a003b75ddefac7.png",
      "publishedAt": "2023-10-04T15:00:00Z",
      "content": "Made by Google 2023 is officially here, and with it, exciting product announcements. Weve now gotten our eyes on the Pixel 8 and Pixel 8 Pro, the Pixel Watch 2, and two new colors for Pixel Buds Pro.… [+3783 chars]"
    },
    {
      "source": {
        "id": "the-verge",
        "name": "The Verge"
      },
      "author": "Wes Davis",
      "title": "Telegram has blocked Hamas channels on Android because Google forced it to",
      "description": "Telegram has blocked two official channels of Hamas on Android phones.",
      "url": "https://www.theverge.com/2023/10/25/23931710/telegram-android-block-hamas-channels-google-play-guidelines-war-israel",
      "urlToImage": "https://cdn.vox-cdn.com/thumbor/VbJ3LeF21b0wZ-YmzjkwK2qjuHU=/0x0:2040x1360/1200x628/filters:focal(1020x680:1021x681)/cdn.vox-cdn.com/uploads/chorus_asset/file/24008016/acastro_STK085_Telegram_01.jpg",
      "publishedAt": "2023-10-25T18:46:55Z",
      "content": "Telegram has blocked Hamas channels on Android because Google forced it to\r\nTelegram has blocked Hamas channels on Android because Google forced it to\r\n / As the war in Israel continues, Telegram has… [+2947 chars]"
    },
    {
      "source": {
        "id": "the-verge",
        "name": "The Verge"
      },
      "author": "Jon Porter",
      "title": "Samsung’s Galaxy S23 starts receiving Android 14 update",
      "description": "Samsung’s Android 14-based One UI 6 update is leaving beta on the Galaxy S23 in Europe. People are seeing the update in countries including the UK, France, and Germany.",
      "url": "https://www.theverge.com/2023/10/30/23938247/samsungs-galaxy-s23-android-14-one-ui-6-update-official-europe-release",
      "urlToImage": "https://cdn.vox-cdn.com/thumbor/D_cuB0uTUiiY4BbVRVMN7sNURcc=/0x0:2000x1333/1200x628/filters:focal(1000x667:1001x668)/cdn.vox-cdn.com/uploads/chorus_asset/file/24453461/DSC04375_processed.jpg",
      "publishedAt": "2023-10-30T11:36:20Z",
      "content": "Samsungs Galaxy S23 starts receiving Android 14 update\r\nSamsungs Galaxy S23 starts receiving Android 14 update\r\n / European users are reporting receiving that a fresh out of beta version of Samsungs … [+1514 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Gizmodo.com"
      },
      "author": "Florence Ion",
      "title": "Android Users to Get Apple-like Login Features This Week",
      "description": "Android users can finally join the realm of the easy login life. Google revealed Monday that Credential Manager will arrive on Android devices beginning Nov. 1, ushering in the next phase of the company’s conversion to passkeys. This also means Android users …",
      "url": "https://gizmodo.com/android-users-get-apple-like-login-features-this-week-1850974287",
      "urlToImage": "https://i.kinja-img.com/image/upload/c_fill,h_675,pg_1,q_80,w_1200/3faec6e1d052889cc5aaede6d16ffbb0.png",
      "publishedAt": "2023-10-30T21:20:00Z",
      "content": "Android users can finally join the realm of the easy login life. Google revealed Monday that Credential Manager will arrive on Android devices beginning Nov. 1, ushering in the next phase of the comp… [+2164 chars]"
    },
    {
      "source": {
        "id": "engadget",
        "name": "Engadget"
      },
      "author": "Mariella Moon",
      "title": "Qualcomm reveals it's making a RISC-V chip for Android wearables",
      "description": "Qualcomm is working with Google to develop a RISC-V platform that can power Wear OS devices. RISC-V is an open standard instruction set architecture (ISA), which Arm describes as \"part of the abstract model of a computer that defines how the CPU is controlled…",
      "url": "https://www.engadget.com/qualcomm-reveals-its-making-a-risc-v-chip-for-android-wearables-124002464.html",
      "urlToImage": "https://s.yimg.com/ny/api/res/1.2/8gKFStL0R_uuQ0fbj4nrIw--/YXBwaWQ9aGlnaGxhbmRlcjt3PTEyMDA7aD04MzQ-/https://s.yimg.com/os/creatr-uploaded-images/2023-08/345e9340-31e1-11ee-bdff-f26414cd25dd",
      "publishedAt": "2023-10-18T12:40:02Z",
      "content": "Qualcomm is working with Google to develop a RISC-V platform that can power Wear OS devices. RISC-V is an open standard instruction set architecture (ISA), which Arm describes as \"part of the abstrac… [+1525 chars]"
    },
    {
      "source": {
        "id": "engadget",
        "name": "Engadget"
      },
      "author": "Kris Holt",
      "title": "Qualcomm's Snapdragon 8 Gen 3 brings on-device generative AI to more Android phones",
      "description": "At its annual Snapdragon Summit on Tuesday, Qualcomm\r\n revealed its latest mobile chipset. Perhaps the biggest change in the Snapdragon 8 Gen 3 is the introduction of on-device generative AI (akin to Google's Tensor G3). The chipset’s AI Engine supports multi…",
      "url": "https://www.engadget.com/qualcomms-snapdragon-8-gen-3-brings-on-device-generative-ai-to-more-android-phones-190019288.html",
      "urlToImage": "https://s.yimg.com/ny/api/res/1.2/oxM_vhxXm93n4s8qJdDkPQ--/YXBwaWQ9aGlnaGxhbmRlcjt3PTEyMDA7aD02OTU-/https://s.yimg.com/os/creatr-uploaded-images/2023-10/fa72cfc0-7281-11ee-bfb3-e4ff777637fc",
      "publishedAt": "2023-10-24T19:00:19Z",
      "content": "At its annual Snapdragon Summit on Tuesday, Qualcomm\r\n revealed its latest mobile chipset. Perhaps the biggest change in the Snapdragon 8 Gen 3 is the introduction of on-device generative AI (akin to… [+4259 chars]"
    },
    {
      "source": {
        "id": "the-verge",
        "name": "The Verge"
      },
      "author": "Wes Davis",
      "title": "Google Photos will soon give you more say in those AI-created video highlights",
      "description": "Google Photos will generate video highlights based on people, places, and activities for iOS and Android versions of the app soon.",
      "url": "https://www.theverge.com/2023/10/24/23930259/google-photos-update-video-highlights-ai-generated-android-ios",
      "urlToImage": "https://cdn.vox-cdn.com/thumbor/n7BNboQ3QEk7QdxRu79cjuFwsj4=/0x0:2040x1360/1200x628/filters:focal(1020x680:1021x681)/cdn.vox-cdn.com/uploads/chorus_asset/file/24016887/STK093_Google_02.jpg",
      "publishedAt": "2023-10-24T17:00:00Z",
      "content": "Google Photos will soon give you more say in those AI-created video highlights\r\nGoogle Photos will soon give you more say in those AI-created video highlights\r\n / With the latest Google Photos update… [+2177 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Lifehacker.com"
      },
      "author": "Pranay Parab",
      "title": "You Should Move Chrome’s Address Bar to the Bottom of Your iPhone",
      "description": "Google Chrome on iOS has finally added one of the best features of Safari—the ability to move the address bar to the bottom of the screen. When you’re using a phone with a massive display, it’s hard to reach the top of the screen to type the name of the site.…",
      "url": "https://lifehacker.com/you-should-move-chrome-s-address-bar-to-the-bottom-of-y-1850945219",
      "urlToImage": "https://i.kinja-img.com/image/upload/c_fill,h_675,pg_1,q_80,w_1200/139ce7d12eb6838e0a124af8028da2e3.jpg",
      "publishedAt": "2023-11-02T14:30:00Z",
      "content": "Google Chrome on iOS has finally added one of the best features of Safarithe ability to move the address bar to the bottom of the screen. When youre using a phone with a massive display, its hard to … [+1543 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Lifehacker.com"
      },
      "author": "Pranay Parab",
      "title": "You Can Create a ‘Live’ Wallpaper on Your Phone",
      "description": "If you’re tired of static wallpapers, you can add a bit of flair to your smartphone by choosing a live wallpaper—that is, using a Live Photo, gif, or short video as your wallpaper. Before you opt to go live, though, you should know it comes with a small hit t…",
      "url": "https://lifehacker.com/you-can-create-a-live-wallpaper-on-your-phone-1850825279",
      "urlToImage": "https://i.kinja-img.com/image/upload/c_fill,h_675,pg_1,q_80,w_1200/e0149fd6a3acb1fe013c872319f13231.jpg",
      "publishedAt": "2023-10-26T12:00:00Z",
      "content": "If youre tired of static wallpapers, you can add a bit of flair to your smartphone by choosing a live wallpaperthat is, using a Live Photo, gif, or short video as your wallpaper. Before you opt to go… [+2268 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Lifehacker.com"
      },
      "author": "Khamosh Pathak",
      "title": "Use This Extension to Block Sponsored Ads on YouTube",
      "description": "There are many ways to watch YouTube ad-free (I highly recommend YouTube Premium). But even if you shell out ${'$'}13.99 per month to remove autoplay ads on YouTube, you still can’t get rid of sponsorship ads. No matter how you watch YouTube, a popular creator may…",
      "url": "https://lifehacker.com/use-this-extension-to-block-sponsored-ads-on-youtube-1850932708",
      "urlToImage": "https://i.kinja-img.com/image/upload/c_fill,f_auto,fl_progressive,g_center,h_675,pg_1,q_80,w_1200/d0d5695105b38a7a32bab928fbf10793.jpg",
      "publishedAt": "2023-10-17T16:00:00Z",
      "content": "There are many ways to watch YouTube ad-free (I highly recommend YouTube Premium). But even if you shell out ${'$'}13.99 per month to remove autoplay ads on YouTube, you still cant get rid of sponsorship … [+1811 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "harish.jonnalagadda@futurenet.com (Harish Jonnalagadda)",
      "title": "Android 15: Five things I want to see",
      "description": "Android 14 is now available, but I'm looking ahead to what's next: Android 15. These are the features I want to see in the next version of Android.",
      "url": "https://www.androidcentral.com/apps-software/android-15",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/zjjVEJhi65E2SCd8gvZ3a7-1200-80.jpg",
      "publishedAt": "2023-10-09T07:26:11Z",
      "content": "Android 14 is now official, but Google is already looking ahead of next year, and that means Android 15. Although it introduced a few new AI-based features, Android 14 turned out to be an incremental… [+4807 chars]"
    },
    {
      "source": {
        "id": "engadget",
        "name": "Engadget"
      },
      "author": "Jeff Dunn",
      "title": "Samsung's Galaxy Watch 6 falls to an all-time low of ${'$'}235",
      "description": "We call Samsung's Galaxy Watch 6 the best option for Android users in our smartwatch buying guide, and it's now on sale for ${'$'}235 at Amazon. There's always a chance we see a better deal on Black Friday, but for now, that's the lowest price we've tracked for th…",
      "url": "https://www.engadget.com/samsungs-galaxy-watch-6-falls-to-an-all-time-low-of-235-151528892.html",
      "urlToImage": "https://s.yimg.com/ny/api/res/1.2/3PiuGSrTZtJ3ClqLDtqq9g--/YXBwaWQ9aGlnaGxhbmRlcjt3PTEyMDA7aD04MDA-/https://s.yimg.com/os/creatr-uploaded-images/2023-09/53ad4740-5181-11ee-b9ef-71886e0ed310",
      "publishedAt": "2023-10-26T15:15:28Z",
      "content": "We call Samsung's Galaxy Watch 6 the best option for Android users in our smartwatch buying guide, and it's now on sale for ${'$'}235 at Amazon. There's always a chance we see a better deal on Black Frida… [+2191 chars]"
    },
    {
      "source": {
        "id": "engadget",
        "name": "Engadget"
      },
      "author": "Mariella Moon",
      "title": "Google and Match Group settle antitrust case before it goes to trial",
      "description": "The antitrust lawsuit Epic Games and Match Group have filed against Google was supposed to go to trial on November 6, but now it looks like the video game developer might go at it alone. Google and Match, the parent company of Tinder, OkCupid and Hinge, have …",
      "url": "https://www.engadget.com/google-and-match-group-settle-antitrust-case-before-it-goes-to-trial-041158809.html",
      "urlToImage": "https://s.yimg.com/ny/api/res/1.2/2.umw5DEZTxqv1czt7En9A--/YXBwaWQ9aGlnaGxhbmRlcjt3PTEyMDA7aD04MDA-/https://s.yimg.com/os/creatr-uploaded-images/2023-10/871dbd80-7864-11ee-9f3f-9642d3093703",
      "publishedAt": "2023-11-01T04:11:58Z",
      "content": "The antitrust lawsuit Epic Games and Match Group have filed against Google was supposed to go to trial on November 6, but now it looks like the video game developer might go at it alone. Google and M… [+2505 chars]"
    },
    {
      "source": {
        "id": "engadget",
        "name": "Engadget"
      },
      "author": "Cherlynn Low",
      "title": "Google Pixel 2023 liveblog: Live updates on the Pixel 8 reveal",
      "description": "With Apple, Samsung, Microsoft and Amazon already having had their fall announcement events this year, Google's hardware keynote is ostensibly the last major launch of 2023. The company has more or less told us what it's going to be unveiling today, teasing u…",
      "url": "https://www.engadget.com/google-pixel-2023-liveblog-live-updates-on-the-pixel-8-reveal-130029820.html",
      "urlToImage": "https://s.yimg.com/ny/api/res/1.2/fRy6DbYnj65uMeLhT2RHgw--/YXBwaWQ9aGlnaGxhbmRlcjt3PTEyMDA7aD02NzU-/https://s.yimg.com/os/creatr-uploaded-images/2023-10/adbd0880-61f6-11ee-9ffa-91161bed1cfb",
      "publishedAt": "2023-10-04T13:00:29Z",
      "content": "With Apple, Samsung, Microsoft and Amazon already having had their fall announcement events this year, Google's hardware keynote is ostensibly the last major launch of 2023. The company has more or l… [+652 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "harish.jonnalagadda@futurenet.com (Harish Jonnalagadda)",
      "title": "Android 14 review: Steady refinement",
      "description": "With Android 14, Google is rolling out plenty of small tweaks that make using Android a little easier, safer, and more reliable. Here's what you need to know about the latest version of Android.",
      "url": "https://www.androidcentral.com/apps-software/android-14-review",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/uzeC98Hs8SJqBFnzCcQ3z9-1200-80.jpg",
      "publishedAt": "2023-10-18T19:08:48Z",
      "content": "Two years after the introduction of the Material You design language, Google is continuing to roll out refinements and tweak the overall aesthetic. That was a big part of Android 13, and Android 14 f… [+15262 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "tips@androidcentral.com (Nickolas Diaz)",
      "title": "Apple almost made an Android-compatible Apple Watch, says report",
      "description": "An Android-compatible Apple Watch never came to fruition because feared an Android-compatible watch would've 'diluted' its value, says one report.",
      "url": "https://www.androidcentral.com/wearables/apple-considered-making-android-compatible-watch",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/gwXLVDyYWgytHVdQQTW56n-1200-80.jpg",
      "publishedAt": "2023-11-02T19:04:57Z",
      "content": "<ul><li>During Apple's report on its future health-based plans for its smartwatch, it briefly discussed its previous aspiration of making it compatible with Android.</li><li>This would've brought all… [+2527 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "namerah.saud-fatmi@futurenet.com (Namerah Saud Fatmi)",
      "title": "How to customize your lock screen on Android 14",
      "description": "Take theming and personalization to the next level with Android 14's rich features. This guide shows you how you can customize your lock screen on Android 14.",
      "url": "https://www.androidcentral.com/apps-software/how-to-customize-your-lock-screen-on-android-14",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/mRq2ebkzkMUEAChv3SS68g-1200-80.jpg",
      "publishedAt": "2023-10-24T12:01:01Z",
      "content": "Android 14 introduced a flurry of new features, enabling users to customize everything from their wallpapers to their lock screens on a granular level. Apart from dynamic wallpapers and the new Emoji… [+2194 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Lifehacker.com"
      },
      "author": "Daniel Oropeza",
      "title": "The Newest Google Pixel Buds Are Already 40% Off",
      "description": "Not every Amazon Prime Day deal is actually a deal, but some of them are legit. Like this one: Google’s Pixel Buds A-Series, which were released earlier this year, are currently ${'$'}59—40% off the regular price of ${'$'}99, matching their lowest price ever, according…",
      "url": "https://lifehacker.com/the-newest-google-pixel-buds-are-already-40-off-1850919604",
      "urlToImage": "https://i.kinja-img.com/image/upload/c_fill,f_auto,fl_progressive,g_center,h_675,pg_1,q_80,w_1200/dbf07a7131c2e2dc11428e29cdb3bf70.png",
      "publishedAt": "2023-10-11T20:36:56Z",
      "content": "Not every Amazon Prime Day deal is actually a deal, but some of them are legit. Like this one: Googles Pixel Buds A-Series, which were released earlier this year, are currently ${'$'}5940% off the regular… [+1230 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Gizmodo.com"
      },
      "author": "Florence Ion",
      "title": "Apple iPhone 15 Review: The iPhone That's Worth the Upgrade",
      "description": "With Google’s next-gen flagship launching just around the corner, this felt like an apt time to visit the iPhone 15/15 Plus and see what this “first tier” model offers alongside its counterpart in the Android world. At its core, the iPhone 15/15 Plus are all …",
      "url": "https://gizmodo.com/apple-iphone-15-review-is-worth-the-upgrade-1850887870",
      "urlToImage": "https://i.kinja-img.com/image/upload/c_fill,f_auto,fl_progressive,g_center,h_675,pg_1,q_80,w_1200/27919ec6791f10717611ac515c147795.png",
      "publishedAt": "2023-10-04T12:30:00Z",
      "content": "With Googles next-gen flagship launching just around the corner, this felt like an apt time to visit the iPhone 15/15 Plus and see what this first tier model offers alongside its counterpart in the A… [+8924 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Lifehacker.com"
      },
      "author": "Jake Peterson",
      "title": "If You Have a Secret Cell Phone, Turn It Off on Wednesday",
      "description": "All cell phones are going to get an audible alert on Wednesday, whether or not they're on silent.",
      "url": "https://lifehacker.com/if-you-have-a-secret-cell-phone-turn-it-off-on-wednesd-1850895009",
      "urlToImage": "https://i.kinja-img.com/image/upload/c_fill,f_auto,fl_progressive,g_center,h_675,pg_1,q_80,w_1200/db5bb8d0ada578da345bd38dc9606466.jpg",
      "publishedAt": "2023-10-03T17:00:00Z",
      "content": "Your phone is about to get loud this week. \r\nOn Wednesday, October 4, at approximately 2:20 p.m. ET (11:20 a.m. PT), FEMA, in partnership with the FCC, is conducting a nationwide test of the Emergenc… [+3356 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "derrek.lee@futurenet.com (Derrek Lee)",
      "title": "Don't text Drake from an Android phone",
      "description": "Drake has a song on his new album that mentions Android and green bubbles. But there could be something deeper there... or not.",
      "url": "https://www.androidcentral.com/apps-software/dont-text-drake-from-android-phone",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/YcMNVPGPdvh6VTJEcfRgGW-1200-80.jpeg",
      "publishedAt": "2023-10-07T01:06:14Z",
      "content": "<ul><li>Toronto rapper Drake just released his new album, \"For All the Dogs,\" on Friday.</li><li>The album features a song called \"First Person Shooter\" that makes a comment about receiving a text fr… [+2511 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Lifehacker.com"
      },
      "author": "Jake Peterson",
      "title": "What to Do When YouTube Warns You About Your Ad-Blocker",
      "description": "YouTube plus an ad-blocker is a fantastic experience. You can watch video after video to your heart’s content, without constant interruptions from loud, occasionally unskippable commercials. But ads are how YouTube makes its money, so they’re not too happy wh…",
      "url": "https://lifehacker.com/youtube-ad-blocker-popup-1850934372",
      "urlToImage": "https://i.kinja-img.com/image/upload/c_fill,f_auto,fl_progressive,g_center,h_675,pg_1,q_80,w_1200/778b39adaedfce4ef74715c25ef6742e.jpg",
      "publishedAt": "2023-10-17T20:30:00Z",
      "content": "YouTube plus an ad-blocker is a fantastic experience. You can watch video after video to your hearts content, without constant interruptions from loud, occasionally unskippable commercials. But ads a… [+2963 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "ted@byteddyk.com (Ted Kritsonis)",
      "title": "How to create Routines in Android Auto",
      "description": "Google Assistant Routines work just fine on Android Auto, letting you automate certain features for quicker access while you drive.",
      "url": "https://www.androidcentral.com/how-to-create-routines-android-auto",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/hq5GePgrqhBsGXu2arief6-1200-80.jpg",
      "publishedAt": "2023-10-25T07:22:29Z",
      "content": "Google Assistant Routines are all about convenience because they can automate a series of actions with just one command. They're designed to help ease the process in which you want to either know or … [+1973 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "namerah.saud-fatmi@futurenet.com (Namerah Saud Fatmi)",
      "title": "How to create emoji wallpapers on Android",
      "description": "Have fun customizing your phone on Android 14. Here's how you can create emoji wallpapers to make it your own.",
      "url": "https://www.androidcentral.com/apps-software/how-to-create-emoji-wallpapers-on-android",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/LM6G6PqLoodgYwigp3FM6E-1200-80.jpg",
      "publishedAt": "2023-10-23T21:44:33Z",
      "content": "Android 14 is here in all of its glory, and it brings some really fun features. Everybody loves emojis, and Google is on to that. The latest platform update brings customizable emoji wallpapers to ou… [+2239 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "jerry.hildenbrand@futurenet.com (Jerry Hildenbrand)",
      "title": "What is a privacy-focused Android phone?",
      "description": "You can buy a \"privacy-focused\" Android phone that attempts to stop big tech from spying on you. Should you?",
      "url": "https://www.androidcentral.com/phones/what-is-a-privacy-focused-android-phone",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/ELard7hBViuECbwh488NM5-1200-80.jpg",
      "publishedAt": "2023-10-25T09:45:07Z",
      "content": "Privacy is one of those things everyone seems to care about, yet most people don't really do anything to protect it. I'm talking about our phones, of course, which not only do plenty of cool things b… [+4816 chars]"
    },
    {
      "source": {
        "id": "engadget",
        "name": "Engadget"
      },
      "author": "Will Shanklin",
      "title": "Motorola is back with another slap bracelet phone concept",
      "description": "Motorola showcased some wacky concepts at Lenovo Tech World ’23 that may or may not ever see the light of day. The smartphone maker (a subsidiary of Lenovo since 2014) unveiled an “adaptive display” prototype that can be rolled into a phone, stand or smart br…",
      "url": "https://www.engadget.com/motorola-is-back-with-another-slap-bracelet-phone-concept-215026843.html",
      "urlToImage": "https://s.yimg.com/ny/api/res/1.2/thPLKgxgo76bjWMKk258_g--/YXBwaWQ9aGlnaGxhbmRlcjt3PTEyMDA7aD03MjA-/https://s.yimg.com/os/creatr-uploaded-images/2023-10/afaf20b0-72ae-11ee-87fe-e5d9d14f0cd9",
      "publishedAt": "2023-10-24T21:50:26Z",
      "content": "Motorola showcased some wacky concepts at Lenovo Tech World 23 that may or may not ever see the light of day. The smartphone maker (a subsidiary of Lenovo since 2014) unveiled an adaptive display pro… [+2818 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "andrew.myrick@futurenet.com (Andrew Myrick)",
      "title": "Samsung rolls out One UI 6 Beta with Android 14 for the Galaxy Z Fold 5",
      "description": "A day after Google rolled out Android 14 QPR1 Beta 2 to Pixel owners, Samsung is bringing the One UI 6 Beta with Android 14 to the Galaxy Z Fold 5.",
      "url": "https://www.androidcentral.com/phones/one-ui-6-beta-1-android-14-samsung-galaxy-z-fold-5",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/HLFPHPFELbhJrMTQGpgmjU-1200-80.jpg",
      "publishedAt": "2023-10-06T16:01:52Z",
      "content": "<ul><li>Samsung has started rolling out One UI 6 Beta 1 to the Galaxy Z Fold 5. </li><li>One UI 6 is based on Android 14, bringing with it a slew of new features.</li><li>This comes a day after the c… [+4048 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "harish.jonnalagadda@futurenet.com (Harish Jonnalagadda)",
      "title": "Pixel 8 and 8 Pro will get Android OS updates until 2030 — that's a game-changer",
      "description": "The Pixel 8 and 8 Pro will get seven Android OS upgrades, more than any other phone to date — not even the iPhone. Here's why this is a pivotal moment not just for Google, but Android as a whole.",
      "url": "https://www.androidcentral.com/phones/pixel-8-8-pro-seven-android-os-updates-game-changer",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/qHeHXNov2PnV4yBmMdi2b3-1200-80.jpg",
      "publishedAt": "2023-10-04T14:30:27Z",
      "content": "Google just introduced the Pixel 8 and 8 Pro, and they offer the usual slate of camera and hardware upgrades that we're used to on an annual basis. Google is also making a big deal out of all the new… [+4782 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Lifehacker.com"
      },
      "author": "Pranay Parab",
      "title": "You Can Now Edit Your Posts on Threads",
      "description": "Unlike a certain mismanaged social network that wants you to pay for the privilege of fixing your typos, Instagram’s Threads app now allows you to edit your posts for free. Along with the ability to post voice messages, it’s yet more evidence that Threads is …",
      "url": "https://lifehacker.com/you-can-now-edit-your-posts-on-threads-1850924676",
      "urlToImage": "https://i.kinja-img.com/image/upload/c_fill,f_auto,fl_progressive,g_center,h_675,pg_1,q_80,w_1200/1774a3a7da8850d0dc6e9bb24f3b2202.jpg",
      "publishedAt": "2023-10-13T22:00:00Z",
      "content": "Unlike a certain mismanaged social network that wants you to pay for the privilege of fixing your typos, Instagrams Threads app now allows you to edit your posts for free. Along with the ability to p… [+1534 chars]"
    },
    {
      "source": {
        "id": "engadget",
        "name": "Engadget"
      },
      "author": "Mariella Moon",
      "title": "Qualcomm's new audio chip uses Wi-Fi to massively extend headphone range",
      "description": "In addition to the Snapdragon 8 Gen 3 and the Snapdragon X Elite, Qualcomm has also introduced the S7 and S7 Pro Gen 1 at the Snapdragon Summit in Hawaii. The company said its new chips deliver six times the compute power of their predecessor's, along with on…",
      "url": "https://www.engadget.com/qualcomms-new-audio-chip-uses-wi-fi-to-massively-extend-headphone-range-091614802.html",
      "urlToImage": "https://s.yimg.com/ny/api/res/1.2/YG98XWCiGuhf5qQzSYZfZw--/YXBwaWQ9aGlnaGxhbmRlcjt3PTEyMDA7aD04MDA-/https://s.yimg.com/os/creatr-uploaded-images/2021-11/e1ad0230-46f0-11ec-9dcf-0e794de509f0",
      "publishedAt": "2023-10-25T09:16:14Z",
      "content": "In addition to the Snapdragon 8 Gen 3 and the Snapdragon X Elite, Qualcomm has also introduced the S7 and S7 Pro Gen 1 at the Snapdragon Summit in Hawaii. The company said its new chips deliver six t… [+1607 chars]"
    },
    {
      "source": {
        "id": "engadget",
        "name": "Engadget"
      },
      "author": "Mariella Moon",
      "title": "Amazon now supports passkey logins on browsers and iOS devices",
      "description": "Amazon, the biggest e-commerce website in most countries, now supports passkeys. That gives users access to the new login solution that's considered more secure than passwords, allowing them to access their account using the biometrics or PIN they use to unlo…",
      "url": "https://www.engadget.com/amazon-now-supports-passkey-logins-on-browsers-and-ios-devices-050129183.html",
      "urlToImage": "https://s.yimg.com/ny/api/res/1.2/DA2XmGRuIteErInOLqfw4w--/YXBwaWQ9aGlnaGxhbmRlcjt3PTEyMDA7aD03NzI-/https://s.yimg.com/os/creatr-uploaded-images/2023-10/4d9dcb40-7224-11ee-9dfe-c655c4c53636",
      "publishedAt": "2023-10-24T05:01:29Z",
      "content": "Amazon, the biggest e-commerce website in most countries, now supports passkeys. That gives users access to the new login solution that's considered more secure than passwords, allowing them to acces… [+1500 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "techkritiko@gmail.com (Jay Bonggolto)",
      "title": "Samsung's budget phones might get a taste of the flagship experience next year",
      "description": "Samsung's entry-level Android phones might get a trick or two from their more expensive siblings.",
      "url": "https://www.androidcentral.com/phones/entry-level-samsung-phones-oled-display",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/mH8chkNZvD3GFu3nJ7bkjX-1200-80.jpg",
      "publishedAt": "2023-10-27T11:41:43Z",
      "content": "<ul><li>Samsung's entry-level Galaxy A phones are reportedly getting OLED displays in 2024, and the next-generation Galaxy A15 could be the first in line.</li><li>This is a significant upgrade over t… [+1996 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "tips@androidcentral.com (Nickolas Diaz)",
      "title": "Google adds weather to Clock and Maps on Android, alarm sync for Pixel Watch",
      "description": "Google has added local weather features to its default Clock app and Maps for Android devices.",
      "url": "https://www.androidcentral.com/apps-software/google-maps-clock-local-weather",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/his9VmmZoSVjseELMC7FNC-1200-80.jpg",
      "publishedAt": "2023-10-17T22:01:18Z",
      "content": "<ul><li>Google Maps has apparently started displaying a \"local weather\" chip for users, but the feature seems to have minimal availability at the moment.</li><li>The chip shows the temperature and co… [+2486 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "tips@androidcentral.com (Nickolas Diaz)",
      "title": "Google vows to fix Android 14's crippling storage problem on Pixels",
      "description": "Google discusses Pixel devices suffering through storage problems on Android 14 with multiple users.",
      "url": "https://www.androidcentral.com/apps-software/google-addresses-pixel-android-14-storage-issues",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/mHgAJ5vvUQhfVEZ3gfK3Sg-1200-80.jpg",
      "publishedAt": "2023-10-30T18:19:12Z",
      "content": "<ul><li>Google is finally addressing the inability to access storage on its devices ranging from the Pixel 6 to the latest Pixel 8 series after installing Android 14.</li><li>Users are faced with the… [+2645 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "tips@androidcentral.com (Nickolas Diaz)",
      "title": "Pixel 8, 8 Pro join the Android 14 QPR1 Beta program a week after launch",
      "description": "Google's Pixel 8 series joins its long list of eligible devices for Android 14 QPR1 testing.",
      "url": "https://www.androidcentral.com/apps-software/pixel-8-series-android-14-qpr1-beta-2",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/47po7vPbimkNg6taSyW5KC-1200-80.jpg",
      "publishedAt": "2023-10-12T17:41:19Z",
      "content": "<ul><li>Pre-ordered Pixel 8 series devices have started arriving for consumers and, as such, so too does their ability to hop into Android 14 QPR1 Beta 2.</li><li>Interested users should enroll and c… [+2047 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "CNET"
      },
      "author": "Stephen Shankland",
      "title": "See the Pixel 8 and Pixel 8 Pro Up Close and Personal - CNET",
      "description": "Google's newest Android phones sport better cameras and new generative AI tools.",
      "url": "https://www.cnet.com/pictures/see-the-pixel-8-and-pixel-8-pro-up-close-and-personal/",
      "urlToImage": "https://www.cnet.com/a/img/resize/33d32bb3a84e72d51ee95afe0b273064a6a3a9be/hub/2023/09/27/e864a91a-7e2d-4a8f-a6da-e8896449f052/20230925-google-pixel-8-and-8-pro-02.jpg?auto=webp&fit=crop&height=675&width=1200",
      "publishedAt": "2023-10-04T14:30:04Z",
      "content": "Photos and videos are a top priority and a competitive strong suit for for Google's phones. This closeup of the \"obsidian\" colored Google Pixel 8 Pro shows its larger new 48-megapixel ultrawide camer… [+107 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "techkritiko@gmail.com (Jay Bonggolto)",
      "title": "Instagram's Android app icon now matches your phone's wallpaper colors",
      "description": "Say goodbye to Instagram's static icon on Android as it finally adopts dynamic theming, meaning its icon will now adapt to your phone's wallpaper colors.",
      "url": "https://www.androidcentral.com/apps-software/instagram-icon-adopting-dynamic-theming",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/XWYAStdB7tewzGVkxFGbAR-1200-80.jpg",
      "publishedAt": "2023-10-23T07:02:15Z",
      "content": "<ul><li>Instagram is among the latest apps to adopt dynamic theming, offering a dual-tone app icon that reflects the dominant color of your phone's wallpaper.</li><li>However, Meta's other apps like … [+2036 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "namerah.saud-fatmi@futurenet.com (Namerah Saud Fatmi)",
      "title": "How to use Cinematic Wallpaper on Android 14",
      "description": "Cinematic Wallpaper on Android 14 creates dynamic wallpapers for your home and lock screens. Here's how you can use it on your phone.",
      "url": "https://www.androidcentral.com/apps-software/how-to-use-cinematic-wallpaper-on-android-14",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/pSqDW5Urz2rNFqLeD55Nfm-1200-80.jpg",
      "publishedAt": "2023-10-27T11:51:09Z",
      "content": "Cinematic Wallpaper isn't a new feature, in case you weren't aware. Google rolled it out as part of the monthly Pixel Feature Drop a few months ago. If you didn't know already, Cinematic Wallpaper on… [+2171 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "derrek.lee@futurenet.com (Derrek Lee)",
      "title": "The Galaxy S23 inches closer to stable Android 14",
      "description": "Samsung is issuing its eighth One UI 6 beta to the Galaxy S23 series, suggesting a stable launch is imminent.",
      "url": "https://www.androidcentral.com/apps-software/one-ui-6-android-14-beta-galaxy-s23-zwj1",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/TTCatu8L3QoUmhnWWfkSDf-1200-80.jpg",
      "publishedAt": "2023-10-20T23:18:42Z",
      "content": "<ul><li>The Galaxy S23 has received a new One UI 6 Beta based on Android 14.</li><li>The update doesn't detail any specific bug fixes, unlike previous beta releases, suggesting stable Android 14 coul… [+1743 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "derrek.lee@futurenet.com (Derrek Lee)",
      "title": "How to create generative AI wallpapers with Android 14",
      "description": "Android 14 comes with new customization features, including generative AI wallpapers that you can use now on the Pixel 8. Here's how.",
      "url": "https://www.androidcentral.com/apps-software/how-create-generative-ai-wallpapers-android-14",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/Hew2Kj8UQQSxRcmNRQ9o9g-1200-80.jpg",
      "publishedAt": "2023-10-22T06:53:06Z",
      "content": "Android 14 is full of fun new features, particularly for Pixel phones. Google has added some new customization options that bring more life and personalization to the home and lock screens, and among… [+3148 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "derrek.lee@futurenet.com (Derrek Lee)",
      "title": "From Android to Windows, Snapdragon Seamless brings your devices together",
      "description": "Qualcomm announces Snapdragon Seamless, a new technology that allows better communication between Snapdragon devices.",
      "url": "https://www.androidcentral.com/phones/qualcomm-snapdragon-seamless-launch",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/avLQZZdKjs3aGJkovR8Bd3-1200-80.jpg",
      "publishedAt": "2023-10-24T19:00:15Z",
      "content": "<ul><li>Qualcomm announced Snapdragon Seamless, a technology that aims to better connect devices.</li><li>Snapdragon Seamless will better enable cross-device communication between different OEMs and … [+2199 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "sam.dunsiger@gmail.com (Samuel Dunsiger)",
      "title": "Visible brings eSIM free trial to Android devices",
      "description": "After only being offered to iOS users, Verizon sub-brand Visible is now extended its eSIM free trial to Android devices.",
      "url": "https://www.androidcentral.com/phones/carriers/visible-extends-esim-free-trial-android",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/rvE8QS4vPUNK7MkqW4ENEK-1200-80.jpg",
      "publishedAt": "2023-11-01T18:26:48Z",
      "content": "<ul><li>Visible's eSIM support for Android devices now includes a free trial.</li><li>This means that if you have a supported device, you can sign up for a 15-day free trial with Visible, with no cre… [+1876 chars]"
    },
    {
      "source": {
        "id": "engadget",
        "name": "Engadget"
      },
      "author": "Jon Fingas",
      "title": "The best multi-device wireless charging pads for 2023",
      "description": "You probably own a ton of gear that supports wireless charging now, but if you want to make your setup as cordless as possible, a single-device pad just won't cut it. There are tons of multiple-item wireless chargers available now, but picking one can be a he…",
      "url": "https://www.engadget.com/best-multi-device-wireless-charging-pads-120557582.html",
      "urlToImage": "https://s.yimg.com/ny/api/res/1.2/bBG1V20PTM4vrf7Fvecl0Q--/YXBwaWQ9aGlnaGxhbmRlcjt3PTEyMDA7aD04MDA-/https://s.yimg.com/os/creatr-uploaded-images/2022-04/fc254730-c7f1-11ec-bafd-8da078ac3742",
      "publishedAt": "2023-11-01T12:05:57Z",
      "content": "You probably own a ton of gear that supports wireless charging now, but if you want to make your setup as cordless as possible, a single-device pad just won't cut it. There are tons of multiple-item … [+6475 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "tips@androidcentral.com (Nickolas Diaz)",
      "title": "Android 14 QPR1 Beta 2.2 drops with over 30 fixes for Google's devices",
      "description": "Google is starting to roll out Android 14 QPR1 Beta 2.2, bringing a ton of bug fixes to affected phones.",
      "url": "https://www.androidcentral.com/apps-software/android-14-qpr1-beta-2-2",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/47po7vPbimkNg6taSyW5KC-1200-80.jpg",
      "publishedAt": "2023-11-02T19:39:31Z",
      "content": "<ul><li>Google is rolling out a much larger Android 14 QPR1 Beta 2.2 for eligible devices as the company looks to fix quite a few glaring problems.</li><li>A couple of main issues fixed include some … [+2787 chars]"
    },
    {
      "source": {
        "id": "the-verge",
        "name": "The Verge"
      },
      "author": "Jay Peters",
      "title": "There’s no way you’ll miss YouTube’s like and subscribe buttons now",
      "description": "As part of a bunch of updates, when a creator says the words “like” or “subscribe,” YouTube will add a visual cue over the corresponding buttons.",
      "url": "https://www.theverge.com/2023/10/17/23920088/youtube-like-subscribe-button-animations",
      "urlToImage": "https://cdn.vox-cdn.com/thumbor/1L6awTcXjbADLDMFfR9g1r5lzDc=/0x0:2040x1360/1200x628/filters:focal(1020x680:1021x681)/cdn.vox-cdn.com/uploads/chorus_asset/file/23986640/acastro_STK092_04.jpg",
      "publishedAt": "2023-10-17T13:00:00Z",
      "content": "Theres no way youll miss YouTubes like and subscribe buttons now\r\nTheres no way youll miss YouTubes like and subscribe buttons now\r\n / YouTube is going to start showing visual cues on the like and su… [+2373 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "tips@androidcentral.com (Vishnu Sarangapurkar)",
      "title": "Android 14 is here, and so are the new customizable generative AI wallpapers",
      "description": "Android 14 brings tons of customizations that start from your lock screen. Additionally, it brings performance improvements too.",
      "url": "https://www.androidcentral.com/apps-software/android-14-launch",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/54mLCYk8YgRfbcUQnmxAGE-1200-80.jpg",
      "publishedAt": "2023-10-04T14:30:08Z",
      "content": "<ul><li>Google announces the official rollout of Android 14 for Pixel devices.</li><li>It brings customizations to the lock screen and home screens.</li><li>They include lock screen templates and gen… [+4817 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "tips@androidcentral.com (Nickolas Diaz)",
      "title": "Android 14 QPR1 Beta 2 arrives swiftly after a stable OS launch",
      "description": "Google is rolling out Android 14 QPR1 Beta 2 to all eligible Pixel devices with a focus on bug fixes.",
      "url": "https://www.androidcentral.com/apps-software/android-14-qpr1-beta-2",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/6Pbab2UAQSsbJGY5N4hKv9-1200-80.jpg",
      "publishedAt": "2023-10-05T21:02:15Z",
      "content": "<ul><li>Google is rolling out Android 14 QPR1 Beta 2 for enrolled and eligible Pixel devices with its focus on correcting known bugs.</li><li>The company has made it known that it's aware of a couple… [+2440 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "tips@androidcentral.com (Nickolas Diaz)",
      "title": "Emoji reactions in Gmail bring extra flair and expression to Android users",
      "description": "Google is starting to roll out emoji reactions for Android Gmail users before bringing it to other platforms.",
      "url": "https://www.androidcentral.com/apps-software/gmail-emoji-reactions-android-rollout",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/f8tGeSUqNBTSbz7iEeM7zM-1200-80.jpg",
      "publishedAt": "2023-10-03T18:46:35Z",
      "content": "<ul><li>Google is starting to rollout its new emoji reactions for mobile Gmail users on Android before bringing it to iOS and web users \"over the next few months.\"</li><li>Once available, users will … [+2520 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "techkritiko@gmail.com (Jay Bonggolto)",
      "title": "WhatsApp is adding passkeys to Android to make your chats even more secure",
      "description": "WhatsApp now supports passkeys on Android, allowing you to unlock your account with a quick face scan or fingerprint.",
      "url": "https://www.androidcentral.com/apps-software/whatsapp-passkeys-rolling-out-on-android",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/TvZiRZSruCSJMJF38W3JoS-1200-80.jpg",
      "publishedAt": "2023-10-17T03:07:14Z",
      "content": "<ul><li>Passkey access is now an added option for logging in to WhatsApp for Android on top of passwords, utilizing on-device face ID or fingerprint for a more secure login process.</li><li>Passkeys … [+2165 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "tips@androidcentral.com (Vishnu Sarangapurkar)",
      "title": "Pixel devices receive the October 2023 security patch with Android 14",
      "description": "Android 14 is here with lots of customizations next to several bug fixes and improvements for Pixel 4a and above.",
      "url": "https://www.androidcentral.com/apps-software/google-pixel-android-14-october-2023-update",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/FtcM3uUNVmuknixDV8p5hG-1200-80.jpg",
      "publishedAt": "2023-10-05T04:09:51Z",
      "content": "<ul><li>Android 14 update has begun rolling out to eligible Pixel users on Android 13.</li><li>The update includes the latest October 2023 security patch coupled with improvements.</li><li>There are … [+2272 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "tips@androidcentral.com (Vishnu Sarangapurkar)",
      "title": "Android 14 statue unveiled upside down with a piece of cake",
      "description": "The tradition of unveiling Android series statues continues this year but with a droid doing a handstand.",
      "url": "https://www.androidcentral.com/apps-software/android-14-official-statue",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/uNYUt6YPGp7sBkmbak2pSg-1200-80.jpg",
      "publishedAt": "2023-10-05T19:03:32Z",
      "content": "<ul><li>Android 14 statue was unveiled after the launch of the Pixel 8 series and the release of the software.</li><li>It features a Bugdroid doing a handstand on what appears to be a piece of cake.<… [+2230 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "andrew.myrick@futurenet.com (Andrew Myrick)",
      "title": "You can try out one of the best Pixel 8 features now",
      "description": "As long as you're running Android 14, there's one Pixel 8-exclusive feature that can be used now.",
      "url": "https://www.androidcentral.com/phones/try-pixel-8-generative-ai-wallpapers-now",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/Hew2Kj8UQQSxRcmNRQ9o9g-1200-80.jpg",
      "publishedAt": "2023-10-04T22:21:13Z",
      "content": "<ul><li>Some users are able to try out Google's Generative AI Wallpapers feature on their Pixel devices. </li><li>You'll need to download the appropriate APK and have a phone running at least Android… [+2617 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "tips@androidcentral.com (Nickolas Diaz)",
      "title": "Pixel 6 owners face a critical storage bug with Android 14",
      "description": "Owners of a Pixel 6 series device have started reporting a serious storage bug following Android 14.",
      "url": "https://www.androidcentral.com/phones/pixel-6-storage-bug-android-14",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/W3SqfhAz5sXRfHd5LoTKtj-1200-80.jpg",
      "publishedAt": "2023-10-17T17:01:53Z",
      "content": "<ul><li>Pixel 6 owners are reporting a crucial storage bug following an Android 14 update, resulting in many wiping their devices and losing their data.</li><li>The problem appears to be tied to thos… [+2831 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "tips@androidcentral.com (Nickolas Diaz)",
      "title": "More Samsung phones get a taste of Android 14 with the One UI 6 beta",
      "description": "Samsung has started rolling out One UI 6 (Android 14) access to Fold 4 owners in South Korea.",
      "url": "https://www.androidcentral.com/phones/galaxy-z-fold-4-flip-4-one-ui-6-beta",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/ZUfmNqBa4sPDDX6LH2qmsa-1200-80.jpg",
      "publishedAt": "2023-10-13T19:18:23Z",
      "content": "<ul><li>Korean users have started receiving access to the One UI 6 (Android 14) beta on the Galaxy Z Fold 4.</li><li>This follows a rather large rollout for the Fold 5 which brought several additions… [+2915 chars]"
    },
    {
      "source": {
        "id": "wired",
        "name": "Wired"
      },
      "author": "Lauren Goode, Michael Calore",
      "title": "Artificial Intelligence Is Seeping Into All of Your Gadgets",
      "description": "This week, we discuss the impact generative AI is having on the world of consumer tech, and the various futures that path could lead us to.",
      "url": "https://www.wired.com/story/gadget-lab-podcast-616/",
      "urlToImage": "https://media.wired.com/photos/65282243e570b8280b890a18/191:100/w_1280,c_limit/All-of-Your-Gadgets-Are-Powered-by-Artificial-Intelligence.-What-Now--Gear.jpg",
      "publishedAt": "2023-10-12T17:39:45Z",
      "content": "Artificial intelligence abounds, and its only making its way deeper and deeper into every scrap of technology we use. Generative AI in particular is an invention that seems destined to follow us far … [+1333 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "CNET"
      },
      "author": "Gael Fashingbauer Cooper",
      "title": "Gmail Is Now Getting Emoji Reactions: Here's How to Use Them - CNET",
      "description": "The option is rolling out now for Android phones, but iOS and web users will have to wait.",
      "url": "https://www.cnet.com/tech/mobile/gmail-is-now-getting-emoji-reactions-heres-how-to-use-them/",
      "urlToImage": "https://www.cnet.com/a/img/resize/36163524260858dfc8eb4ea7d7a9c677a8b1a634/hub/2023/08/08/acba936b-65e5-4b1f-a275-f86499c77654/bedtime-phone-sleep-emoji.jpg?auto=webp&fit=crop&height=675&width=1200",
      "publishedAt": "2023-10-04T21:06:00Z",
      "content": "A thumbs-up here, kissy lips there, a cat face here -- emoji are seemingly everywhere. The colorful little images show up in text messages, Facebook, Instagram, even Slack. And now, emoji are coming … [+2204 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "ReadWrite"
      },
      "author": "Deanna Ritchie",
      "title": "Disturbing advertisement found in children’s games on Android",
      "description": "A pro-Israel video advertisement has been discovered in children’s games on Android devices, raising concerns among parents. London-based barista Maria […]\nThe post Disturbing advertisement found in children’s games on Android appeared first on ReadWrite.",
      "url": "https://readwrite.com/disturbing-advertisement-found-in-childrens-games-on-android/",
      "urlToImage": "https://readwrite.com/wp-content/uploads/2023/11/advertisement-childrens-games.png",
      "publishedAt": "2023-11-01T22:43:44Z",
      "content": "A pro-Israel video advertisement has been discovered in children’s games on Android devices, raising concerns among parents. London-based barista Maria Julia Cassis reported that her 6-year-old son w… [+2439 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "ReadWrite"
      },
      "author": "Maxwell William",
      "title": "Android 14 debuts: What’s new in Google’s latest mobile OS update?",
      "description": "Google has announced the release of Android 14, the latest iteration of its mobile operating system. This new version promises […]\nThe post Android 14 debuts: What’s new in Google’s latest mobile OS update? appeared first on ReadWrite.",
      "url": "https://readwrite.com/android-14-debuts-whats-new-in-googles-latest-mobile-os-update/",
      "urlToImage": "https://readwrite.com/wp-content/uploads/2023/07/denny-muller-HfWA-Axq6Ek-unsplash.jpg",
      "publishedAt": "2023-10-04T19:25:59Z",
      "content": "Google has announced the release of Android 14, the latest iteration of its mobile operating system. This new version promises to elevate the user experience with a slew of innovative features and im… [+2384 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Lifehacker.com"
      },
      "author": "Stephen Johnson",
      "title": "Where to Stream the Ohio State Vs. Purdue Game",
      "description": "The Ohio State Buckeyes travel to West Lafayette, Indiana this Saturday with the intention of thrashing the outmatched Purdue Boilermakers.Read more...",
      "url": "https://lifehacker.com/where-to-stream-the-ohio-state-vs-purdue-1850922585",
      "urlToImage": "https://i.kinja-img.com/image/upload/c_fill,f_auto,fl_progressive,g_center,h_675,pg_1,q_80,w_1200/7895d8d5dec214f418ad662265d32f36.jpg",
      "publishedAt": "2023-10-12T20:00:00Z",
      "content": "The Ohio State Buckeyes travel to West Lafayette, Indiana this Saturday with the intention of thrashing the outmatched Purdue Boilermakers.\r\nThe Buckeyes are the number 3 college team in the nation a… [+1736 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "derrek.lee@futurenet.com (Derrek Lee)",
      "title": "Qualcomm comes after Google's AI crown with the new Snapdragon 8 Gen 3",
      "description": "Qualcomm launches the new Snapdragon 8 Gen 3, a flagship SoC that brings a ton of new AI capabilities to Android phones.",
      "url": "https://www.androidcentral.com/phones/qualcomm-snapdragon-8-gen-3-launch",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/JTFPxtm24hoTwB4MWXiA2R-1200-80.jpg",
      "publishedAt": "2023-10-24T19:00:49Z",
      "content": "<ul><li>Qualcomm announces its latest flagship mobile platform, the snapdragon 8 Gen 3.</li><li>The chipset aims to enable new AI capabilities on mobile devices, particularly when it comes to images … [+3842 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "techkritiko@gmail.com (Jay Bonggolto)",
      "title": "Google's Credential Manager is here to make signing in to apps a breeze",
      "description": "Google's Credential Manager is coming to Android 14 on November 1, and it's going to make logging in to apps easier than ever.",
      "url": "https://www.androidcentral.com/apps-software/android-credential-manager-rolling-out",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/mm3UtMVWwLj5Vr4S9KmPfg-1200-80.jpg",
      "publishedAt": "2023-10-30T14:11:47Z",
      "content": "<ul><li>Google's Credential Manager will store credentials like usernames, passwords, and passkeys for Android apps.</li><li>Credential Manager houses biometric authentication for all of these creden… [+2356 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "tips@androidcentral.com (Vishnu Sarangapurkar)",
      "title": "Nothing Phone (2) update brings new Photo widget and other features",
      "description": "After introducing the first open beta of Android 14, Nothing is bringing some of its features to Phone (2) via the Nothing OS 2.0.4 update.",
      "url": "https://www.androidcentral.com/apps-software/nothing-os-2-4-rolling-out-phone-2",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/Nwrdq5MQeEdHHHsMpHHZG4-1200-80.jpg",
      "publishedAt": "2023-11-02T02:14:12Z",
      "content": "<ul><li>Nothing brings notable improvements and new features with the latest update.</li><li>Nothing OS version 2.0.4 is being rolled out to the Phone (2).</li><li>The update brings a new Photo widge… [+1982 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "andrew.myrick@futurenet.com (Andrew Myrick)",
      "title": "Apple made the wrong decision not bringing the Apple Watch to Android",
      "description": "Apple was reportedly working on making the Apple Watch compatible with Android phones. The project was then canceled, but Apple made a mistake in doing so.",
      "url": "https://www.androidcentral.com/wearables/apple-watch-android-wrong-decision",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/YenYGQ6a6FyYWe3wZyZWen-1200-80.jpg",
      "publishedAt": "2023-11-03T08:30:26Z",
      "content": "Recently, a report surfaced claiming that at one point in time, Apple was actually considering making the Apple Watch compatible with Android phones. Internally, this was known as \"Project Fennel,\" a… [+6155 chars]"
    },
    {
      "source": {
        "id": "engadget",
        "name": "Engadget"
      },
      "author": "Mariella Moon",
      "title": "Brave's AI assistant comes to its desktop browser",
      "description": "Brave joins the growing list of browsers that come with built-in generative AI assistants. The open source browser developer has started rolling out an update for Brave on desktop, which gives users access to its AI assistant Leo. Brave introduced Leo through…",
      "url": "https://www.engadget.com/braves-ai-assistant-comes-to-its-desktop-browser-160010918.html",
      "urlToImage": "https://s.yimg.com/ny/api/res/1.2/hy1VqimfFsap.._lGORMzA--/YXBwaWQ9aGlnaGxhbmRlcjt3PTEyMDA7aD04MDA-/https://s.yimg.com/os/creatr-uploaded-images/2021-06/fd163430-d28b-11eb-b377-c0e600bf35f0",
      "publishedAt": "2023-11-02T16:00:10Z",
      "content": "Brave joins the growing list of browsers that come with built-in generative AI assistants. The open source browser developer has started rolling out an update for Brave on desktop, which gives users … [+2067 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "techkritiko@gmail.com (Jay Bonggolto)",
      "title": "Android's Emergency SOS mishap is now a thing of the past",
      "description": "Google has added a new \"touch and hold\" step to its Personal Safety app to address those accidental emergency calls from your Android phone.",
      "url": "https://www.androidcentral.com/apps-software/android-accidental-911-calls-fixed",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/vFZo9jZDnqPWRsAwgD8LgB-1200-80.jpg",
      "publishedAt": "2023-10-24T03:55:31Z",
      "content": "<ul><li>Google has updated its Personal Safety app to require a \"touch and hold\" step to send a call for emergency services in response to a spike in accidental calls from Android phones.</li><li>The… [+2039 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "sam.dunsiger@gmail.com (Samuel Dunsiger)",
      "title": "Microsoft Edge on Android Canary now gives one-tap web page summaries with its AI tool",
      "description": "Microsoft's AI-powered Copilot feature is getting a front seat in the latest upgrade of the Edge for Android Canary build.",
      "url": "https://www.androidcentral.com/apps-software/microsoft-edge-on-android-canary-now-gives-one-tap-web-page-summaries-with-its-ai-tool",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/XLbh2AhFzV7EfyZAGnsZ4d-1200-80.jpg",
      "publishedAt": "2023-10-24T11:57:35Z",
      "content": "<ul><li>The latest update for the Canary build of Microsoft Edge for Android is taking the company's AI-powered Copilot feature to the next level.</li><li>The upgrade embedded the Copilot button into… [+1855 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "derrek.lee@futurenet.com (Derrek Lee)",
      "title": "Chrome finally lets you move the address bar to the bottom, but not on Android",
      "description": "Google's latest update for Chrome on iOS lets users move the address bar to the bottom. There's no word on if this will make it to Android.",
      "url": "https://www.androidcentral.com/apps-software/chrome-ios-move-address-bar-bottom",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/mw3mJajmwGew84fy39GEKE-1200-80.jpg",
      "publishedAt": "2023-10-31T20:07:34Z",
      "content": "<ul><li>Google announced that it's allowing iOS users to move the address bar to the bottom of the app.</li><li>The feature should make the bar easier to access as opposed to placing it at the top, a… [+1879 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "techkritiko@gmail.com (Jay Bonggolto)",
      "title": "More Pixel phones are finally receiving the redesigned Pixel At a Glance widget",
      "description": "After making its way to other Android phones, the refreshed At a Glance widget is making its way to more Pixel handsets.",
      "url": "https://www.androidcentral.com/apps-software/pixel-at-a-glance-widget-big-redesign",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/ygrs523qfAZEvXe7ET3MDQ-1200-80.jpg",
      "publishedAt": "2023-10-09T11:39:57Z",
      "content": "<ul><li>The redesigned At a Glance widget is now widely available on Pixel phones, but not on the Pixel Fold and the Pixel Tablet.</li><li>However, the new design does not apply to the fixed Launcher… [+2155 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "tips@androidcentral.com (Vishnu Sarangapurkar)",
      "title": "MediaTek's four Cortex X4 cores-powered flagship processor gets a launch date",
      "description": "MediaTek is gearing up with a powerful flagship processor for upcoming Android phones to compete against SoCs from Qualcomm and Samsung.",
      "url": "https://www.androidcentral.com/phones/mediatek-dimensity-9300-soc-to-launch-november-16",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/Se3TfmkX5h5mZPRn89qWue-1200-80.jpg",
      "publishedAt": "2023-10-25T15:45:06Z",
      "content": "<ul><li>MediaTek announced the launch date of Dimensity 9300 SoC.</li><li>It will likely have a 1+3 CPU combination involving all four Cortex X4 cores.</li><li>The upcoming chipset will soon power so… [+1891 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "shruti.shekar@futurenet.com (Shruti Shekar)",
      "title": "Made by Google event 2023 live blog: Pixel 8, Watch 2, and everything we expect to see",
      "description": "Google is set to announce a bunch of new devices and Android Central will be closely watching to see what comes out! Follow along!",
      "url": "https://www.androidcentral.com/news/live/made-by-google-pixel-2023-live-blog",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/3gD3Wn2cpwKPEonarcYNyF-1200-80.jpg",
      "publishedAt": "2023-10-03T20:08:35Z",
      "content": "“Techtober” has arrived, and we’re really just getting started, as Google has already announced major changes coming to Chromebooks, and is gearing up for the launch of its 2023 flagship lineup. \r\nTh… [+231 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "nicholas.sutrich@futurenet.com (Nicholas Sutrich)",
      "title": "The two best Android controllers are only on sale for a few more hours",
      "description": "No matter what kind of Android controller you prefer, the Razer Kishi V2 and GameSir X2 are both on sale for Prime Day and will exceed your expectations.",
      "url": "https://www.androidcentral.com/accessories/best-android-controller-prime-day-deal-2023",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/RbfMeMo8KJHm56W6x42ExH-1200-80.jpg",
      "publishedAt": "2023-10-11T17:35:34Z",
      "content": "When I go to play a round of Fortnite or relax with the vibes of Minecraft, I always reach for the Razer Kishi V2 or GameSir X2. Both controllers are stellar examples of how to turn a phone into a Ni… [+2391 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "techkritiko@gmail.com (Jay Bonggolto)",
      "title": "Xiaomi 13, 13 Pro, and 12T finally pick up their sweet Android 14 upgrade",
      "description": "Android 14 is finally out for Xiaomi's latest top-of-the-line phones on the stable channel, and it's packed with new features and goodies.",
      "url": "https://www.androidcentral.com/phones/xiaomi-launches-stable-android-14",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/63qNG784MaUzXPKoVR48Po-1200-80.jpg",
      "publishedAt": "2023-10-07T14:24:58Z",
      "content": "<ul><li>Xiaomi is rolling out stable builds of the latest MIUI version based on Android 14 to three of its latest premium smartphones a few weeks after the beta test began.</li><li>The Xiaomi 13, 13 … [+2298 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "sharmarajat@zoho.com (Rajat Sharma)",
      "title": "Google Pixel Watch 2 vs. Pixel Watch: Should you upgrade?",
      "description": "Can't decide between Google Pixel Watch 2 vs. Pixel Watch? We compare these best Android smartwatches to help you choose the right one for your needs.",
      "url": "https://www.androidcentral.com/wearables/google-pixel-watch-2-vs-pixel-watch",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/yGStpzJjqN667eK6qWhPd8-1200-80.jpg",
      "publishedAt": "2023-10-18T16:25:46Z",
      "content": "Launched in October 2022 after years of delays, the Pixel Watch has proven to be well worth the wait. Although it continues to be a great option, Google's first smartwatch is no longer the newest thi… [+10595 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "patrick.farmer@futurenet.com (Patrick Farmer)",
      "title": "Early Black Friday Android TV deals — upgrade your home theater for cheap",
      "description": "Black Friday is just weeks away, but there are plenty of Android TV deals available now. Here are the best we've found so far.",
      "url": "https://www.androidcentral.com/streaming-tv/black-friday-android-tv-deals-2023",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/iHqxaRRbGj5EbBe6RZCYsU-1200-80.jpg",
      "publishedAt": "2023-10-18T16:52:37Z",
      "content": "The biggest Black Friday sales are still weeks away, but if you don't want to wait, there are plenty of Android TV deals worth checking out now. Whether you want a small budget smart TV or a sophisti… [+1439 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "michael.hicks@futurenet.com (Michael L Hicks)",
      "title": "Google Pixel Watch 2 vs. Samsung Galaxy Watch 6: Which is the best Android watch?",
      "description": "It's the comparison that all fans of Android smartwatches have been waiting for. Is Google's second attempt at a smartwatch better matched against Samsung's flagship watches?",
      "url": "https://www.androidcentral.com/wearables/google-pixel-watch-2-vs-samsung-galaxy-watch-6",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/gTjV2AijgSRpbXZRSUnoQ6-1200-80.jpg",
      "publishedAt": "2023-10-05T16:38:42Z",
      "content": "Google and Samsung may have co-developed the modern version of Wear OS, but each takes its own hardware and software approach to making an Android smartwatch. Comparing the Google Pixel Watch 2 and S… [+13518 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "derrek.lee@futurenet.com (Derrek Lee)",
      "title": "Pixel 8 owners will have to wait to get Android 14 QPR1 Beta 2.1",
      "description": "Google releases Android 14 QPR1 Beta 2.1 to eligible Pixel devices. The Pixel 8 and Pixel 8 Pro will receive the update at a later date.",
      "url": "https://www.androidcentral.com/apps-software/android-14-qpr1-beta-2-1",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/rVJJyWmCM8SimVqjoVUCfE-1200-80.jpg",
      "publishedAt": "2023-10-19T19:17:46Z",
      "content": "<ul><li>Google has released the Android 14 QPR1 Beta 2.1, which comes with a few big fixes.</li><li>Devices will be automatically updated to Beta 2.1, but Pixel 8 devices will receive the update at a… [+1917 chars]"
    },
    {
      "source": {
        "id": "ars-technica",
        "name": "Ars Technica"
      },
      "author": "Kevin Purdy",
      "title": "Apple slides from 2013 skewer Android as “a massive tracking device”",
      "description": "But Apple also wanted to know what results users clicked on Google from iPhones.",
      "url": "https://arstechnica.com/tech-policy/2023/11/apple-called-android-a-massive-tracking-device-in-a-2013-presentation/",
      "urlToImage": "https://cdn.arstechnica.net/wp-content/uploads/2023/11/Screenshot-2023-11-02-at-2.51.18 PM-760x380.png",
      "publishedAt": "2023-11-02T20:13:20Z",
      "content": "Enlarge/ It just reads different in that typeface.\r\n16 with \r\n\"Here is [sic] the latest slides we have on privacy,\" Senior Vice President of Services Eddy Cue wrote to CEO Tim Cook and then-SVP of Ma… [+4575 chars]"
    },
    {
      "source": {
        "id": "engadget",
        "name": "Engadget"
      },
      "author": "Lawrence Bonk",
      "title": "Dead Cells: Netflix Edition scares its way to a Halloween release date",
      "description": "We knew Netflix had snagged the iconic roguelike/metroidvania\r\n Dead Cells for its ever-growing games library, and now we know when it’ll release. Dead Cells: Netflix Edition will be available on October 31. That’s Halloween, to those who don’t mess with the …",
      "url": "https://www.engadget.com/dead-cells-netflix-edition-scares-its-way-to-a-halloween-release-date-152630472.html",
      "urlToImage": "https://s.yimg.com/ny/api/res/1.2/TWB3dvaR7zU5h0lNwx2V3g--/YXBwaWQ9aGlnaGxhbmRlcjt3PTEyMDA7aD02NzE-/https://s.yimg.com/os/creatr-uploaded-images/2023-10/6b74fd20-7349-11ee-90f7-136dfba5bc5b",
      "publishedAt": "2023-10-25T15:26:30Z",
      "content": "We knew Netflix had snagged the iconic roguelike/metroidvania\r\nDead Cells for its ever-growing games library, and now we know when itll release. Dead Cells: Netflix Edition will be available on Octob… [+1854 chars]"
    },
    {
      "source": {
        "id": "the-verge",
        "name": "The Verge"
      },
      "author": "Sean Hollister",
      "title": "Google will stock Pixel 8 spare parts for seven years",
      "description": "Google has committed to making spare parts available for the Pixel 8 and Pixel 8 Pro for the next seven years, alongside the company’s seven-year update promise. It’s getting out ahead of a California right-to-repair law.",
      "url": "https://www.theverge.com/2023/10/9/23910082/google-will-stock-pixel-8-spare-parts-for-seven-years",
      "urlToImage": "https://cdn.vox-cdn.com/thumbor/a_JfcPVqvossXiQbLWEaj3yyIO0=/0x0:2040x1198/1200x628/filters:focal(1020x680:1021x681)/cdn.vox-cdn.com/uploads/chorus_asset/file/24971367/236823_Pixel_8_8Pro_Watch2_VPavic_0012.jpg",
      "publishedAt": "2023-10-09T18:08:15Z",
      "content": "Google will stock Pixel 8 spare parts for seven years\r\nGoogle will stock Pixel 8 spare parts for seven years\r\n / This may soon become the law in California but Googles getting out ahead.\r\nBySean Holl… [+1721 chars]"
    },
    {
      "source": {
        "id": "the-verge",
        "name": "The Verge"
      },
      "author": "Jay Peters",
      "title": "The Fitbit app has been having some issues for hours",
      "description": "The Fitbit app has been dealing with some issues for hours, and the Google-owned company acknowledged that there are some problems and that it’s investigating what’s going on.",
      "url": "https://www.theverge.com/2023/10/11/23913740/fitbit-issues-app-down-problems-outage",
      "urlToImage": "https://cdn.vox-cdn.com/thumbor/sT8ljliexWASOxIZMkE2bgZ0SNw=/0x0:8256x6192/1200x628/filters:focal(4128x3096:4129x3097)/cdn.vox-cdn.com/uploads/chorus_asset/file/24956824/Fitbit_Charge_6_Lifestyle_Cycling_Porcelain.png",
      "publishedAt": "2023-10-12T00:57:54Z",
      "content": "The Fitbit app has been having some issues for hours\r\nThe Fitbit app has been having some issues for hours\r\n / Fitbit is investigating whats going on.\r\nByJay Peters, a news editor who writes about te… [+1383 chars]"
    },
    {
      "source": {
        "id": "wired",
        "name": "Wired"
      },
      "author": "Michael Calore, Lauren Goode, Boone Ashworth",
      "title": "What to Do When Hackers Crash Your Gene Pool Party",
      "description": "This week, we talk about how the data of millions of 23andMe customers was stolen and put up for sale. Pro tip: Don’t use the same password on multiple websites.",
      "url": "https://www.wired.com/story/gadget-lab-podcast-618/",
      "urlToImage": "https://media.wired.com/photos/65399aa6803005187e398a51/191:100/w_1280,c_limit/What-to-Do-When-Hackers-Crash-Your-Gene-Pool-Party-GearGettyImages-1461156252.jpg",
      "publishedAt": "2023-10-26T12:00:00Z",
      "content": "Genetic testing companies like 23andMe and Ancestry offer a pretty enticing prospect. Just mail off a little bit of your spit in a tube and the company's lab can reveal the details of your ethnic bac… [+1894 chars]"
    },
    {
      "source": {
        "id": "engadget",
        "name": "Engadget"
      },
      "author": "Sam Rutherford",
      "title": "Google leans into high-end camera features for the ${'$'}999 Pixel 8 Pro",
      "description": "On Wednesday at its annual hardware event, Google announced its next flagship phone: the Pixel 8 Pro. Starting at ${'$'}999, it costs ${'$'}100 more than its predecessor, so to make up for that increased price Google added a number of enhanced photo and video features,…",
      "url": "https://www.engadget.com/google-leans-into-high-end-camera-features-for-the-999-pixel-8-pro-143040260.html",
      "urlToImage": "https://s.yimg.com/ny/api/res/1.2/Aq29sMdbWTiqiyrJ6J79SA--/YXBwaWQ9aGlnaGxhbmRlcjt3PTEyMDA7aD03MjA-/https://s.yimg.com/os/creatr-uploaded-images/2023-10/0d7b1530-622b-11ee-96fc-a9e9a4e41e3e",
      "publishedAt": "2023-10-04T14:30:40Z",
      "content": "On Wednesday at its Made by Google event, Google announced its next flagship phone: the Pixel 8 Pro. Starting at ${'$'}999, it costs ${'$'}100 more than its predecessor, so to make up for that increased price … [+3874 chars]"
    },
    {
      "source": {
        "id": "engadget",
        "name": "Engadget"
      },
      "author": "Jeff Dunn",
      "title": "Google Pixel 8 Pro vs. the competition: From Tensor to temperature sensor",
      "description": "After weeks of teases and leaks, Google has formally taken the wraps off its next flagship smartphone, the Pixel 8 Pro. The handset adds a host of new camera and AI features, a brighter OLED display, an improved Tensor G3 chip, seven years of software updates…",
      "url": "https://www.engadget.com/google-pixel-8-pro-vs-the-competition-from-tensor-to-temperature-sensor-151016002.html",
      "urlToImage": "https://s.yimg.com/ny/api/res/1.2/1VgvNruKs6mV73c64t0msw--/YXBwaWQ9aGlnaGxhbmRlcjt3PTEyMDA7aD03MjA-/https://s.yimg.com/os/creatr-uploaded-images/2023-10/52852f80-622b-11ee-af29-e5701f222e60",
      "publishedAt": "2023-10-04T15:10:16Z",
      "content": "After weeks of teasesandleaks, Google formally took the wraps off its next flagship smartphone, the Pixel 8 Pro. Revealed during the company's Made by Google event on Wednesday, the handset adds a ho… [+4663 chars]"
    },
    {
      "source": {
        "id": "engadget",
        "name": "Engadget"
      },
      "author": "Will Shanklin",
      "title": "The Google Pixel Fold’s dual-screen interpreter begins rolling out",
      "description": "During its Made by Google event on Wednesday, Google announced that it will begin rolling out several new Pixel features, including the Pixel Fold’s dual-screen interpreter mode. The novel translation feature, which Engadget tested earlier this year, uses the…",
      "url": "https://www.engadget.com/the-google-pixel-folds-dual-screen-interpreter-begins-rolling-out-170003067.html",
      "urlToImage": "https://s.yimg.com/ny/api/res/1.2/s9Dlbd6dj0GN8X9gzotJAQ--/YXBwaWQ9aGlnaGxhbmRlcjt3PTEyMDA7aD02NzU-/https://s.yimg.com/os/creatr-uploaded-images/2023-09/f1748b60-48ed-11ee-b4ff-30a0d169ad2f",
      "publishedAt": "2023-10-04T14:12:42Z",
      "content": "During its Made by Google event on Wednesday, Google announced that it will begin rolling out several new Pixel features, including the Pixel Folds dual-screen interpreter mode. The novel translation… [+2499 chars]"
    },
    {
      "source": {
        "id": "engadget",
        "name": "Engadget"
      },
      "author": "Lawrence Bonk",
      "title": "Netflix nabs the iconic Dead Cells for its ever-growing games library",
      "description": "Netflix’s game studio is slowly but surely dropping new titles, adding around 40 mobile releases in 2023.\r\n One such game is the universally-acclaimed Metroidvania/roguelike action gem Dead Cells, which was just announced as part of the streamer’s “Netflix & …",
      "url": "https://www.engadget.com/netflix-nabs-the-iconic-dead-cells-for-its-ever-growing-games-library-150038384.html",
      "urlToImage": "https://s.yimg.com/ny/api/res/1.2/OZQN3gPUFVjqMi04K.eOBQ--/YXBwaWQ9aGlnaGxhbmRlcjt3PTEyMDA7aD02NzU-/https://s.yimg.com/os/creatr-uploaded-images/2023-10/b52e7c30-62d6-11ee-bedc-3210daef0c54",
      "publishedAt": "2023-10-05T15:00:38Z",
      "content": "Netflixs game studio is slowly but surely dropping new titles, adding around 40 mobile releases in 2023.\r\n One such game is the universally-acclaimed Metroidvania/roguelike action gem Dead Cells, whi… [+2486 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "tips@androidcentral.com (Vishnu Sarangapurkar)",
      "title": "Samsung rolls out stable One UI 6 (Android 14) on the Galaxy S23 series",
      "description": "After testing out multiple betas of One UI 6 on Galaxy devices, Samsung finally started bringing the stable ones on Galaxy S23, S23 Plus, and the S23 Ultra.",
      "url": "https://www.androidcentral.com/apps-software/samsung-galaxy-s23-stable-one-ui-6-android-14",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/6j7LByXFzhFc8uHXeAbaPf-1200-80.jpg",
      "publishedAt": "2023-10-30T16:20:59Z",
      "content": "<ul><li>One UI 6 beta users are welcomed with a stable release on Galaxy S23 devices.</li><li>It will be a sizable update if users are upgrading from Android 13 to Android 14 (as opposed to updating … [+2243 chars]"
    },
    {
      "source": {
        "id": "wired",
        "name": "Wired"
      },
      "author": "Eric Ravenscraft",
      "title": "14 Best Deals: TVs, Keyboards, Mice, Chargers, and Earbuds",
      "description": "As the leaves start to fall, get ready to hunker down with upgrades to your home theater or gaming rig.",
      "url": "https://www.wired.com/story/midweek-deals-october-19-2023/",
      "urlToImage": "https://media.wired.com/photos/64e4f616b4309ed4e5faedeb/191:100/w_1280,c_limit/LG-C3-OLED-TV-Gear.jpg",
      "publishedAt": "2023-10-19T15:56:15Z",
      "content": "With the latest Amazon-created Prime-themed sale day behind us, and Black Friday slowly approaching, the deals world feels a bit like Pippin waiting on the edge of battle. But that doesn't mean there… [+5576 chars]"
    },
    {
      "source": {
        "id": "wired",
        "name": "Wired"
      },
      "author": "Julian Chokkattu",
      "title": "OnePlus Open Review: A Surprisingly Good First Attempt",
      "description": "The first folding phone from OnePlus gets a lot right, from its smart software to its affordable price.",
      "url": "https://www.wired.com/review/oneplus-open/",
      "urlToImage": "https://media.wired.com/photos/65307f72d28937d298777dbf/191:100/w_1280,c_limit/OnePlus-Open-Review-Featured-Gear.jpg",
      "publishedAt": "2023-10-19T15:00:00Z",
      "content": "There I was in the second row at the Google Pixel 8 launch event. The keynote was about to start, and while other journalists pulled out their laptops and started typing away, I whipped out the OnePl… [+4227 chars]"
    },
    {
      "source": {
        "id": "business-insider",
        "name": "Business Insider"
      },
      "author": "Matthew Loh",
      "title": "Telegram rarely bans channels. Israel-Gaza forced it to step in.",
      "description": "Telegram, which is known for its message encryption and lax moderation, restricted two official Hamas channels on Android devices earlier this month.",
      "url": "https://www.businessinsider.com/telegram-channel-ban-israel-gaza-dagestan-russia-airport-durov-2023-10",
      "urlToImage": "https://i.insider.com/65409f8c96f7540cd069f15b?width=1200&format=jpeg",
      "publishedAt": "2023-11-01T09:05:43Z",
      "content": "Pro Palestinian protesters burn an effigy of Israeli Prime Minister Benjamin Netanyahu on October 20, 2023 in Istanbul, Turkey.Burak Kara/Getty Images\r\n<ul>\n<li>Telegram banned a channel on the groun… [+6747 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Hackaday"
      },
      "author": "Jenny List",
      "title": "Android: Coming Soon To A RISC-V Processor Near You",
      "description": "In the roughly decade and a half since the Android mobile operating system appeared on the scene it has been primarily sold on devices with an ARM core at their heart, but along the way it has also…",
      "url": "https://hackaday.com/2023/11/01/android-coming-soon-to-a-risc-v-processor-near-you/",
      "urlToImage": "https://hackaday.com/wp-content/uploads/2023/04/risc5-esp32-c3-thumbnail.jpg",
      "publishedAt": "2023-11-01T11:00:43Z",
      "content": "In the roughly decade and a half since the Android mobile operating system appeared on the scene it has been primarily sold on devices with an ARM core at their heart, but along the way it has also a… [+1322 chars]"
    },
    {
      "source": {
        "id": "wired",
        "name": "Wired"
      },
      "author": "Simon Hill",
      "title": "Sony Xperia 5 V Review: Small and Mighty but Too Pricey",
      "description": "Sony’s more affordable smartphone is five-by-five, with punchy performance and a quality camera, but it’s still too expensive.",
      "url": "https://www.wired.com/review/sony-xperia-5-v/",
      "urlToImage": "https://media.wired.com/photos/6532b4504f86430b053e21a3/191:100/w_1280,c_limit/Sony-Xperia-5-V-Gear.jpg",
      "publishedAt": "2023-10-23T12:00:00Z",
      "content": "The chief problem I had with Sony's flagship smartphone of 2023, the Xperia 1 V, was that it was just too darn expensive for what it offered. So here we are with the more affordable Xperia 5 V (prono… [+3897 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "jerry.hildenbrand@futurenet.com (Jerry Hildenbrand)",
      "title": "What is RISC-V and what does it mean for Android and Wear OS?",
      "description": "Qualcomm and Google are developing a RISC-V Snapdragon Wear platform to power future devices. Why is this important, and what does it mean for you?",
      "url": "https://www.androidcentral.com/wearables/what-is-risc-v",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/m4Eu3XSYN2GXSA3fbuSg69-1200-80.jpg",
      "publishedAt": "2023-10-18T15:00:57Z",
      "content": "Qualcomm has announced that it's working with Google to develop a custom Wear OS platform using the RISC-V ISA. We already knew Qualcomm was investing heavily into advancing the use of RISC-V with th… [+4485 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "tips@androidcentral.com (Vishnu Sarangapurkar)",
      "title": "Android 14 based Nothing OS 2.5 Open Beta 1 rolls out to Phone (2)",
      "description": "Nothing promises to make its phone experience as efficient and personal as possible with the new Open Beta 1 update for Phone (2) users.",
      "url": "https://www.androidcentral.com/apps-software/android-14-based-nothing-os-2-dot-5-open-beta-1-released",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/CPDs4o43vihsdtz5XmohPX-1200-80.jpg",
      "publishedAt": "2023-10-11T18:38:21Z",
      "content": "<ul><li>Nothing OS 2.5 claims to be the company's most significant update after OS 2.0.</li><li>It brings Android 14 to the device for the first alongside the new monochrome theme and several other r… [+3170 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Hipertextual"
      },
      "author": "Gabriel Erard",
      "title": "Android 14 ya está disponible: estas son sus principales novedades",
      "description": "Android 14, la nueva versión del sistema operativo móvil de Google, ya se encuentra disponible. Los de Mountain View han aprovechado el evento de lanzamiento de los Pixel 8 y Pixel 8 Pro para introducir el software, después de varios meses de prueba en fase b…",
      "url": "http://hipertextual.com/2023/10/android-14-ya-disponible",
      "urlToImage": "https://imgs.hipertextual.com/wp-content/uploads/2023/10/Android-14.jpg",
      "publishedAt": "2023-10-04T18:31:15Z",
      "content": "Android 14, la nueva versión del sistema operativo móvil de Google, ya se encuentra disponible. Los de Mountain View han aprovechado el evento de lanzamiento de los Pixel 8 y Pixel 8 Pro para introdu… [+4066 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "andrew.myrick@futurenet.com (Andrew Myrick)",
      "title": "Prime Day deals that the Android Central team couldn't pass up",
      "description": "Amazon's Prime Big Deal Days is here and we've rounded up a few of the deals that the team here actually picked up!",
      "url": "https://www.androidcentral.com/accessories/prime-day-deals-that-the-android-central-team-couldnt-pass-up",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/m876z8etQpRJ3fpH2Lf8sm-1200-80.jpg",
      "publishedAt": "2023-10-11T00:44:47Z",
      "content": "Amazon's Prime Big Deal Days got underway while many of us were still asleep. There are millions of deals just on Amazon and even more if you start including those from Best Buy, Target, Walmart, and… [+1207 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Gizmodo.com"
      },
      "author": "Florence Ion",
      "title": "Hands-On With the Google Pixel 8, Pixel 8 Pro, and Pixel Watch 2",
      "description": "I’m struggling to muster excitement over the latest batch of Pixel devices. The Pixel 8 and 8 Pro have improved in style and design and probably in performance, too (I can only confirm everything once I test the specs myself). But where’s the flair? The featu…",
      "url": "https://gizmodo.com/hands-on-google-pixel-8-pixel-8-pro-and-pixel-watch-2-1850893865",
      "urlToImage": "https://i.kinja-img.com/image/upload/c_fill,f_auto,fl_progressive,g_center,h_675,pg_1,q_80,w_1200/76a62417fac8bb13b7e5c4b398450a88.jpg",
      "publishedAt": "2023-10-04T14:40:00Z",
      "content": "Im struggling to muster excitement over the latest batch of Pixel devices. The Pixel 8 and 8 Pro have improved in style and design and probably in performance, too (I can only confirm everything once… [+5881 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "patrick.farmer@futurenet.com (Patrick Farmer)",
      "title": "Early Black Friday deal makes my favorite cheap Android phone cheaper than it's EVER been",
      "description": "Amazon is dropping 25% off the Google Pixel 7a, making the midrange masterpiece cheaper than it's ever been.",
      "url": "https://www.androidcentral.com/phones/early-black-friday-deal-makes-our-favorite-cheap-android-phone-cheaper-than-ever-been",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/XdMmfD6PbabJsVJAb632CL-1200-80.jpg",
      "publishedAt": "2023-11-02T17:00:42Z",
      "content": "Once more for the folks in the back: the Google Pixel 7a is currently seeing a 25% discount, the biggest price drop it's ever seen, thanks to a Black Friday deal from Amazon. \r\nThis surprising discou… [+1146 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "tips@androidcentral.com (Nickolas Diaz)",
      "title": "One UI 6 (Android 14) expected next week if all goes well for Samsung",
      "description": "A community moderator for Samsung suggests the company could release One UI 6 soon as it enters the final week of testing.",
      "url": "https://www.androidcentral.com/apps-software/one-ui-6-upcoming-rollout-rumor",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/GL6Re6ALQ4fbZfyaeUjNUf-1200-80.jpg",
      "publishedAt": "2023-10-24T18:58:44Z",
      "content": "<ul><li>Samsung's Korean forums are discussing a moderator's comments, which suggest this is the company's final week of One UI 6 (Android 14) testing.</li><li>If all goes well, Samsung could roll ou… [+1975 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Android Central"
      },
      "author": "tips@androidcentral.com (Nickolas Diaz)",
      "title": "Samsung's new cloud backup gives your data a 30-day vacation, arriving with Android 14",
      "description": "Samsung's 'Temporary Cloud Backup' has your back, whether you're getting a new phone or taking yours in for repairs.",
      "url": "https://www.androidcentral.com/apps-software/samsung-temporary-cloud-backup-announcement",
      "urlToImage": "https://cdn.mos.cms.futurecdn.net/bdqbDJ7HqFUthMGwFYSU6D-1200-80.jpg",
      "publishedAt": "2023-10-26T12:00:09Z",
      "content": "<ul><li>Samsung announces \"Temporary Cloud Backup,\" a storage service for accounts looking to store important items for up to 30 days.</li><li>There is no limit to how much one can store, though item… [+2698 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "CNET"
      },
      "author": "Imad Khan",
      "title": "Google Assistant With Bard Puts an AI Chatbot in Your iPhone or Android - CNET",
      "description": "Soon you'll be able to ask Assistant to summarize your emails, plan your hikes and more.",
      "url": "https://www.cnet.com/tech/services-and-software/google-assistant-with-bard-puts-an-ai-chatbot-in-your-iphone-or-android/",
      "urlToImage": "https://www.cnet.com/a/img/resize/265f06a192f577602a958aadfdbac874dbb87029/hub/2023/10/04/856eb64e-6663-46ae-b8cc-9e68ef9ea94d/google-event-pixel-100423-102.jpg?auto=webp&fit=crop&height=675&width=1200",
      "publishedAt": "2023-10-06T17:14:14Z",
      "content": "Google Assistant has long been the voice-activated companion found on Android devices, responding to your \"Hey, Google\" commands on your phone to set an alarm or send a text. At its Made by Google ev… [+4548 chars]"
    }
  ]
}"""
}