layout 'layouts/main.groovy', true,
        pageTitle: 'TThe tursfriend company - Clients',
        mainContent: contents {
            div(id: 'content', class: 'page-1') {
                div(class: 'row') {
                    div(class: 'row-fluid') {
                        div(class: 'col-lg-3') {
                            ul(class: 'nav-sidebar') {
                                li(class: 'active') {
                                    a(href: 'events.html') { strong('tursfriend Events') }
                                }
                            }
                        }

                        div(class: 'col-lg-8 col-lg-pull-0') {
                            include template: 'includes/contribute-button.groovy'
                            h1 {
                                i(class: 'fa fa-cloud-download') {}
                                yield ' Clients'
                            }
         
                            article {
                                p {
                                    yield 'In this Clients area, you will be able to find some of the tursfriend clients '
                                }
                            }
                            
                            hr(class: 'divider')

                            a(name: 'gvm') {}
                            article {
                                h1 'GVM (the tursfriend enVironment care)'
                                p {
                                    yield 'We care about the Environment.'
                                    br()
                                }
                            }
                            
                        }
                    }
                }
            }
        }
