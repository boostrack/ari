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

                        div(class: 'col-lg-8 col-lg-pull-0') {
                            include template: 'includes/contribute-button.groovy'
                            h1 {
                                i(class: 'fa fa-cloud-download') {}
                                yield ' know-how'
                            }
         
                            article {
                                p {
                                    include unescaped: 'html/know-how.html'
                                }
                            }
                            
                            hr(class: 'divider')
                        }

  
                    }
                }
            }
        }