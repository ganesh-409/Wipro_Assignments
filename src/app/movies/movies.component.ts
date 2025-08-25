import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

// Angular Material
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatSelectModule } from '@angular/material/select';
import { MatCardModule } from '@angular/material/card';
import { MatIconModule } from '@angular/material/icon';

type Movie = {
  title: string;
  genre: string;
  rating: number;    // 1–5 (can be decimals)
  poster: string;
  description: string;
};

@Component({
  selector: 'app-movies',
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    MatToolbarModule,
    MatFormFieldModule,
    MatSelectModule,
    MatCardModule,
    MatIconModule
  ],
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent {

  // ---- Static data ----
  movies: Movie[] = [
    {
  title: 'Pournami',
  genre: 'Musical / Drama',
  rating: 3.8,
  poster: 'https://m.media-amazon.com/images/S/pv-target-images/cc78c63b2bfe8594b15e4b8504e72af0f015955ef98e0cbb9f478f4054f8f86c.jpg',
  description: 'A young woman continues her family tradition of a sacred dance, while romance and destiny intervene.'
},

{
  title: 'Badrinath',
  genre: 'Action / Fantasy',
  rating: 3.7,
  poster: 'https://ksboxoffice.com/wp-content/uploads/2020/03/1317379036646592.jpg',
  description: 'A skilled warrior trained by a guru protects a sacred temple from evil forces while falling in love.'
},
{
  title: 'Chatrapathi',
  genre: 'Action / Drama',
  rating: 4.2,
  poster: 'https://cinemachaat.com/wp-content/uploads/2010/10/chatrapati.jpg',
  description: 'A displaced man rises as a leader and protector of oppressed people while searching for his mother.'
},
{
  title: 'Rangasthalam',
  genre: 'Action / Drama',
  rating: 4.7,
  poster: 'https://resizing.flixster.com/8_YYrj9lvvOvwp0EPuLAZrtXdjY=/ems.cHJkLWVtcy1hc3NldHMvbW92aWVzLzVlZTI4ZjhiLTQ2YTktNDM4MS1hYmFhLWQ5YjJhMjM5NTdjNC53ZWJw',
  description: 'A hearing-impaired man challenges a corrupt village president.'
},
{
  title: 'Eega',
  genre: 'Fantasy / Revenge',
  rating: 4.5,
  poster: 'https://m.media-amazon.com/images/S/pv-target-images/2c41e0b7aa6bf97462f8e42b699a68393c08af406c6f9fa7d130634b5118468f._SX1080_FMjpg_.jpg',
  description: 'A murdered man reincarnates as a housefly to take revenge on his killer.'
}
   
  ];

  // ---- Filtering ----
  selectedGenre: string = 'All';
  get genres(): string[] {
    return ['All', ...Array.from(new Set(this.movies.map(m => m.genre)))];
  }

  get filteredMovies(): Movie[] {
    return this.selectedGenre === 'All'
      ? this.movies
      : this.movies.filter(m => m.genre === this.selectedGenre);
  }

  // ---- Average rating (all movies) ----
  get averageRating(): number {
    const total = this.movies.reduce((sum, m) => sum + m.rating, 0);
    return Number((total / this.movies.length).toFixed(1));
  }

  // ---- Styling helpers ----
  isTopRated(m: Movie): boolean {
    return m.rating >= 4.5; // highlight
  }

  starIcon(i: number, rating: number): 'star' | 'star_half' | 'star_border' {
    const diff = rating - i + 1; // i is 1..5
    if (diff >= 1) return 'star';
    if (diff >= 0.5) return 'star_half';
    return 'star_border';
  }
}
