layout 'layouts/main.groovy', true,
        pageTitle: 'The tursfriend company - FAQ - Frequently Asked Questions',
        mainContent: contents {
            div(id: 'content', class: 'page-1') {
                div(class: 'row') {
                    div(class: 'row-fluid') {
                       
                       include template: 'includes/contribute-button.groovy'
                        h1 {
                            i(class: 'fa fa-question-circle') {}
                            yieldUnescaped ' Frequently Asked Questions'
                        }
                        hr(class: 'divider')
                        article {
                            h2 'Is tursfriend a serious company?'
                            p {
                                yield 'Yes! '
                                a(href: 'http://www.apache.org/licenses/LICENSE-2.0', 'Apache License v2')
                            }

                            h2 'What are the differences between tursfriend and others?'
                            p {
                                yield 'Learn more about the '
                                a(href: 'differences.html', 'differences between tursfriend and others')
                                yield '.'
                            }
                        }
                    }
                }
            }
        }