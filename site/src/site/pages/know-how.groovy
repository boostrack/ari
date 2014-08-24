layout 'layouts/main.groovy', true,
        pageTitle: 'The tursfriend company - know-how',
        mainContent: contents {
            div(id: 'content', class: 'page-1') {
                div(class: 'row') {
                    div(class: 'row-fluid') {
                        div(class: 'col-lg-3') {
                            ul(class: 'nav-sidebar') {
                                li(class: 'active') {
                                    a(href: '#') { strong('know-how') }
                                }
                                li {
                                    a(href: 'faq.html', class: 'anchor-link', 'FAQ')
                                }
                            }
                        }

  
                    }
                }
            }
        }