menu {
    group('tursfriend') {
        item 'Services',                       'learn.html'
        item 'know-how',               'documentation.html'
        item 'Clients',                    'download.html'
        item 'Events',                   'community.html'
    }

    group('About') {
        item 'Build status',                'buildstatus.html'
        item 'Sponsors',                    'sponsors.html'
        item 'FAQ',                         'faq.html'
        item 'Search',                      'search.html'
    }

    group('Socialize') {
        item 'Groovy on Twitter',           'https://twitter.com/hashtag/groovylang',           'fa-twitter'
        item 'Events and conferences',      'events.html',                                      'fa-calendar'
        item 'Google+ tursfriend Page',     'https://google.com/+groovy',                       'fa-google-plus'
        item 'Facebook tursfriend',         'http://www.facebook.com/tursfriend',               'fa-facebook'
    }
}

pages {
    page 'index', 'index', [allEvents: allEvents]
    page 'learn', 'learn', [category: 'Learn', videos: videos]
    page 'community', 'community', [category: 'Community']
    page 'sponsors', 'sponsors', [category: 'Community']
    page 'buildstatus', 'buildstatus', [category: 'Community']
    page 'faq', 'faq', [category: 'Documentation', docSections: documentationSections]
    page 'events', 'events', [category: 'Community', allEvents: allEvents]
    page 'singlepagedocumentation', 'single-page-documentation', [category: 'tursfriend', iframeTarget: 'http://docs.groovy-lang.org/docs/next/html/documentation/']
}

allEvents {
    event('GR8Conf US 2014') {
        location 'Minneapolis, MN, USA'
        date 'July 28-29, 2014'
        url 'http://gr8conf.us/'
        logo 'img/confs/gr8confus2014.png'
        description '''
            <p>
            Groovy, Grails and the related technologies have seen astounding growth in interest and adoption the past
            few years, and with good reason. To spread the word even more we have created GR8Conf.
            </p>
            <p>
            GR8Conf is an independent, affordable series of conferences.
            It's dedicated to the technologies in the Groovy ecosystem.
            </p>
        '''
    }
    event('SpringOne 2GX 2014') {
        location 'Dallas, TX, USA'
        date 'September 8-11, 2014'
        url 'http://springone2gx.com/'
        logo 'img/confs/s2gx2014.png'
        description '''
            <p>
            Pivotal and No Fluff Just Stuff bring you SpringOne 2GX 2014, a one-of-a-kind conference for application
            developers, solution architects, web operations and IT teams who develop business applications, create
            multi-device aware web applications, design cloud architectures, and manage high performance infrastructure.
            The sessions are specifically tailored for developers using the hugely popular open source Spring IO projects,
            Groovy & Grails, Cloud Foundry, Hadoop and Tomcat technologies. Whether you're building and running
            mission-critical business applications, designing the next killer cloud or big data application,
            SpringOne 2GX will keep you up to date with the latest enterprise open source technology.
            </p>
        '''
    }
    event('Groovy Grails eXchange 2014') {
        location 'London, United Kingdom'
        date 'December 11-12, 2014'
        url 'https://skillsmatter.com/conferences/1957-groovy-grails-exchange-2014'
        logo 'img/confs/ggex2014.png'
        description '''
            <p>
            Do you love Groovy & Grails? Would you like to spend 2 days with 150+ Groovy & Grails developers, learning
            and sharing skills with the world's leading experts on Groovy, Grails and modern enterprise development?
            </p>
            <p>
            Then why not come to the 8th annual Groovy & Grails eXchange and be part of this passionate community of
            creators, founders, developers and enthusiasts.
            </p>
        '''
    }
        event('GR8Conf EU 2015') {
        location 'Copenhagen, Denmark'
        date 'June 2-4, 2015'
        url 'http://gr8conf.eu/'
        logo 'img/confs/gr8confeu2015.png'
        description '''
            <p>
            Groovy, Grails and the related technologies have seen astounding growth in interest and adoption the past
            few years, and with good reason. To spread the word even more we have created GR8Conf.
            </p>
            <p>
            GR8Conf is an independent, affordable series of conferences.
            It's dedicated to the technologies in the Groovy ecosystem.
            </p>
        '''
    }
}


videos {
    video('Groovy in 2014 and beyond') {
        speaker 'Guillaume Laforge'
        summary '''
            <p>Groovy is already 10 years old, but continues to evolve and innovate.</p>
            <p>What's new under the hood? - implicit closure coercion - new AST transforms - finer grained script configuration - type checker extensions</p>
            <p>In the upcoming versions of Groovy, you'll be able to create "traits", do tail recursions, and much more.</p>
            <p>We'll also talk about what's cooking for Groovy 3.0, with its new Meta-Object Protocol, its new grammar, its JDK 8 support.</p>
        '''
        pictureUrl 'groovy-in-2014-and-beyond.png'
        videoUrl 'https://www.youtube.com/watch?v=P63OHYc3q8s&list=PLwxhnQ2Qv3xuE4JEKBpyE2AbbM_7G0EN1&index=2'
        slidesUrl 'https://speakerdeck.com/glaforge/groovy-in-2014-and-beyond-at-gr8conf-europe-2014'
    }

    video('The Groovy ecosystem revisited') {
        speaker 'Andrés Almiray'
        summary '''
            <p>Groovy is a well established player in the JVM since a few years ago.
            It's increased popularity across the years has spawned several projects that conform the Groovy Ecosystem.
            You've probably heard of Grails, Gradle, Griffon and Spock.
            But what about the rest of projects that are just waiting around the corner to be discovered and make your life easier?
            This talk presents them tools and libraries that use Groovy as the main driving force to get the job done.</p>
        '''
        pictureUrl 'groovy-ecosystem-revisited.png'
        videoUrl 'https://www.youtube.com/watch?v=2NGeaIwmnC8&list=PLwxhnQ2Qv3xuE4JEKBpyE2AbbM_7G0EN1&index=5'
        slidesUrl 'http://fr.slideshare.net/aalmiray/gr8conf-groovy-ecosystem'
    }

    video('Metaprogramming with the Groovy runtime') {
        speaker 'Jeff Brown'
        summary '''
            <p>The dynamic runtime nature of Groovy is one of the things that sets it apart from standard Java and makes it a fantastic language for building dynamic applications for the Java Platform.
            The metaprogramming capabilities offered by the language provide everything that an application development team needs to build systems that are far more capable than their all Java counterparts.
            This Part 1 of 2 will cover the runtime metaprogramming capabilities of Groovy. The session will dive deep into Groovy's Meta Object Protocol (MOP) which implements the incredibly dynamic runtime dispatch mechanism.
            The session will include a lot of live code demonstrating really powerful runtime features of the language.
            This session is focused specifically on Groovy's runtime metaprogramming capabilities.
            Part 2 of 2 will cover Groovy's compile time metaprogramming capabilities</p>
        '''
        pictureUrl 'metaprogramming-part-1.png'
        videoUrl 'https://www.youtube.com/watch?v=1xvg8Wcj-hg&list=PLwxhnQ2Qv3xuE4JEKBpyE2AbbM_7G0EN1&index=9'
    }

    video('Groovy Puzzlers') {
        speaker 'Noam Tenne'
        summary '''
            <p>Remember the epic Java Puzzlers? Here's the Groovy version, and we have some neat ones!
            Even though we are totally a Grails shop here at JFrog, some of these had us scratching our heads for days trying to figure them out.
            And there is more!
            Contributions from the truly Groovy senseis, including Guillaume Laforge, Andrés Almiray, Tim Yates, Ken Kousen
            make this talk an unforgettable journey to Groovy.
            In this talk, you'll have the expected dose of fun and enlightenment hearing about our mistakes and failures, great and small,
            in hard core Groovy/Grails development.</p>
        '''
        pictureUrl 'groovy-puzzlers.png'
        videoUrl 'https://www.youtube.com/watch?v=GfIhxi7L6R0&list=PLwxhnQ2Qv3xuE4JEKBpyE2AbbM_7G0EN1&index=17'
    }
}
