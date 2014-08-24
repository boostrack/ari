layout 'layouts/main.groovy', true,
        pageTitle: 'The Groovy programming language - Sponsors',
        mainContent: contents {
            div(id: 'content', class: 'page-1') {
                div(class: 'row') {
                    div(class: 'row-fluid') {
                        div(class: 'col-lg-3') {
                            include template: 'includes/community-navbar.groovy'
                        }

                        div(class: 'col-lg-8 col-lg-pull-0') {
                            include template: 'includes/contribute-button.groovy'
                            h1 {
                                i(class: 'fa fa-building-o') {}
                                yield ' Sponsors'
                            }
                            article {
                                
                            }
                            hr(class: 'divider')
                        }
                    }
                }
            }
        }