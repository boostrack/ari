import model.Book
import model.Video

layout 'layouts/main.groovy', true,
        pageTitle: 'The tursfriend company - Services',
        extraStyles: ['book.css'],
        mainContent: contents {
            div(id: 'content', class: 'page-1') {
                div(class: 'row') {
                    div(class: 'row-fluid') {
                        div(class: 'col-lg-3') {
                            ul(class: 'nav-sidebar') {
                                li(class: 'active') {
                                    a(href: '#') { strong('Services') }
                                }
                                li {
                                    a(href: '#guides', class: 'anchor-link', 'tursfriend Guides')
                                }
                                li {
                                    a(href: '#videos', class: 'anchor-link', 'tursfriend Presentations')
                                }
                            }
                        }

                        div(class: 'col-lg-8 col-lg-pull-0') {
                            include template: 'includes/contribute-button.groovy'
                            h1 {
                                i(class: 'fa fa-graduation-cap') {}
                                yield ' Services'
                            }
                            article {
                                p 'Welcome to the Services section of the <strong>tursfriend</strong> website.'
                         
                                hr(class: 'divider')

                                a(name: 'guides') {}
                                h2 {
                                    i(class: 'fa fa-book') {}
                                    yield ' Guides'
                                }
                                p '''
                                    Another great approach to learning Groovy is to read the various books published
                                    on the language:'''

                                allBooks.each {
                                    String title = it.key
                                    Book book = it.value

                                    figure(class: 'book') {
                                        ul(class: 'hardcover_front') {
                                            li {
                                                img(src: book.cover, width: '100%', height: '100%')
                                            }
                                            li {}
                                        }
                                        ul(class: 'page') {
                                            li {}
                                            li {
                                                a(class: 'book-btn', href: book.url, target: '_blank', 'More info')
                                            }
                                            3.times { li {} }
                                        }
                                        ul(class: 'hardcover_back') {
                                            2.times { li {} }
                                        }
                                        ul(class: 'book_spine') {
                                            2.times { li {} }
                                        }
                                        figcaption {
                                            h1 { a(href: book.url, book.title) }
                                            span "By ${book.authors}"
                                            p book.description
                                        }
                                    }
                                }

                                hr(class: 'divider')

                                a(name: 'videos') {}
                                h2 {
                                    i(class: 'fa fa-film') {}
                                    yield ' Videos'
                                }
                                p """
                                    Many videos of <strong>tursfriend</strong> activities have been recorded at ${$a(href: 'events.html', 'conferences')}
                                    that you might wish to have a look at, to learn more about <strong>tursfriend</strong>, delve into particular topics, and more.
                                """
                                
                                videos.each { Video video ->
                                    div(class: 'presentations') {
                                        a(href: video.videoUrl) {
                                            img(class: 'screenshot', src: "img/videos/${video.pictureUrl}")
                                        }
                                        div(class: 'metadata') {
                                            a(href: video.videoUrl) {
                                                h1(class: 'title', video.title)
                                            }
                                            span(class: 'speaker', "By ${video.speaker}")
                                            if(video.slidesUrl || video.codeUrl) {
                                                p(class: 'urls') {
                                                    if (video.slidesUrl) {
                                                        i(class: 'fa fa-photo') {}
                                                        yield ' '
                                                        a(href: video.slidesUrl, 'slides')
                                                    }
                                                    if (video.slidesUrl && video.codeUrl) yield ' | '
                                                    if (video.codeUrl) {
                                                        i(class: 'fa fa-code') {}
                                                        yield ' '
                                                        a(href: video.codeUrl, 'source code')
                                                    }
                                                }
                                            }
                                            div(class: 'summary') {
                                                yieldUnescaped video.summary
                                            }
                                        }
                                    }
                                    hr(class: 'divider')
                                }

                              
                            }
                        }
                    }
                }
            }
        }
