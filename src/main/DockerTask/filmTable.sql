create table public.films
(
    id int primary key,
    genre varchar,
    name varchar

);
INSERT INTO public.films (genre, name) VALUES ('Horror', 'Stranger things');
INSERT INTO public.films (genre, name) VALUES ('Comedy', 'The bodyguard of killer');
INSERT INTO public.films (genre, name) VALUES ('Drama', 'Titanic');