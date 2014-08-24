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
                                docSections.each { section ->
                                    li { a(href: "#${section.anchor}", class: 'anchor-link', section.name) }
                                }
                                li {
                                    a(href: 'faq.html', 'FAQ')
                                }
                            }
                        }

  
                    }
                }
            }
        }