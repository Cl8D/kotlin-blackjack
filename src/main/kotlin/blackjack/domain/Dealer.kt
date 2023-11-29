package blackjack.domain

import blackjack.domain.player.Players

class Dealer(
    private val deck: Deck
) {

    fun handCards(count: Int, players: Players) {
        repeat(count) {
            handCard(players)
        }
    }

    private fun handCard(players: Players) {
        players.values.forEach { player ->
            player.handCard(deck.draw())
        }
    }
}
