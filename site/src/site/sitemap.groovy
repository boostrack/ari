menu {
    group('tursfriend') {
        item 'Services',                    'services.html'
        item 'know-how',                    'know-how.html'
        item 'Clients',                     'clients.html'
        item 'Events',                      'events.html'
    }

    group('About') {
        item 'Sponsors',                    'sponsors.html'
        item 'FAQ',                         'faq.html'
        item 'Search',                      'search.html'
    }

    group('Socialize') {
        item 'tursfriend on Twitter',       'https://twitter.com/hashtag/tursfriend',           'fa-twitter'
        item 'Events and conferences',      'events.html',                                      'fa-calendar'
        item 'Google+ tursfriend Page',     'https://google.com/+tursfriend',                   'fa-google-plus'
        item 'Facebook tursfriend',         'http://www.facebook.com/tursfriend',               'fa-facebook'
    }
}

pages {
    page 'index', 'index', [allEvents: allEvents]
    page 'services', 'services', [category: 'Services', videos: videos]
    page 'know-how', 'know-how', [category: 'know-how']
    page 'clients', 'clients', [category: 'Clients']
    page 'events', 'events', [category: 'Events', allEvents: allEvents]
    
    page 'sponsors', 'sponsors', [category: 'Sponsors']
    page 'faq', 'faq', [category: 'FAQ', docSections: documentationSections]
    page 'search', 'search', [category: 'Search']

}

allEvents {
    event('Tursfriend release party Fall 2014 (Porto)') {
        location 'Minneapolis, MN, USA'
        date 'Sept 01-09, 2014'
        url 'http://tursfriend-openening-party.com/'
        logo 'img/confs/gr8confus2014.png'
        description '''
            <p>
                Tursfriend release package party - Fall 2014 
            </p>
        '''
    }
     event('Tursfriend release party Fall 2014 (Lisbon)') {
        location 'Minneapolis, MN, USA'
        date 'Sept 11-09, 2014'
        url 'http://tursfriend-openening-party.com/'
        logo 'img/confs/gr8confus2014.png'
        description '''
            <p>
                Tursfriend release party - 11-09 2014 - Estádio da Luz (A ver se cai o abiao) 
            </p>
        '''
    }
}


videos {
    video('Tursfriend in 2014 and beyond') {
        speaker 'Ari Monteiro'
        summary '''
            <p>Tursfriend.</p>
            <p>What's new under the hood? Ari well tell us</p>
        '''
        pictureUrl 'groovy-in-2014-and-beyond.png'
        videoUrl 'https://www.youtube.com/watch?v=P63OHYc3q8s&list=PLwxhnQ2Qv3xuE4JEKBpyE2AbbM_7G0EN1&index=2'
        slidesUrl 'https://speakerdeck.com/glaforge/groovy-in-2014-and-beyond-at-gr8conf-europe-2014'
    }

    video('The Tursfriend social') {
        speaker 'Ari Monteiro'
        summary '''
            <p>Tursfriend is increasing popularity across the years has spawned several plesure Ecosystem.</p>
        '''
        pictureUrl 'groovy-ecosystem-revisited.png'
        videoUrl 'https://www.youtube.com/watch?v=2NGeaIwmnC8&list=PLwxhnQ2Qv3xuE4JEKBpyE2AbbM_7G0EN1&index=5'
        slidesUrl 'http://fr.slideshare.net/aalmiray/gr8conf-groovy-ecosystem'
    }
    
}
